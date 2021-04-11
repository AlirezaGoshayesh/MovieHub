package com.test.moviehub.data.remote.connection

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthTokenInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response = chain.run {
        proceed(
            request()
                .newBuilder()
                .addHeader(
                    "Authorization",
                    "Bearer"
                )
                .build()
        )
    }
}