@file:Suppress("DEPRECATION")

package com.test.moviehub.utils

import android.content.Context
import android.net.*
import android.os.Build
import androidx.lifecycle.LiveData
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class NetworkConnection @Inject constructor(@ActivityContext private val mContext: Context) :
    LiveData<Boolean>() {

    private var connectivityManager: ConnectivityManager =
        mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    private lateinit var networkCallback: ConnectivityManager.NetworkCallback

    private fun request() {
        val requestBuilder = NetworkRequest.Builder()
            .addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR)
            .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
            .addTransportType(NetworkCapabilities.TRANSPORT_ETHERNET)
        connectivityManager.registerNetworkCallback(
            requestBuilder.build(),
            connectivityManagerCallback()
        )
    }

    override fun onActive() {
        super.onActive()
        updateConnection()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            connectivityManager.registerDefaultNetworkCallback(connectivityManagerCallback())
        else if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP)
            request()
    }

    override fun onInactive() {
        super.onInactive()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            try {
                connectivityManager.unregisterNetworkCallback(connectivityManagerCallback())
            } catch (e: Exception){
            }
    }

    private fun connectivityManagerCallback(): ConnectivityManager.NetworkCallback {
        networkCallback = object : ConnectivityManager.NetworkCallback() {

            override fun onLost(network: Network) {
                super.onLost(network)
                postValue(false)
            }

            override fun onAvailable(network: Network) {
                super.onAvailable(network)
                postValue(true)
            }
        }
        return networkCallback
    }

    private fun updateConnection() {
        val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
        postValue(networkInfo?.isConnected == true)
    }
}