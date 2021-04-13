package com.vada.parents.component.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.domain.GetDetails
import com.test.moviehub.domain.base.UseCaseCallback
import com.test.moviehub.domain.exceptions.ErrorModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GetDetailsVM @Inject constructor(
    private val getDetails: GetDetails
) : ViewModel() {

    private val _children by lazy { MutableLiveData<GetDetailsResponse>() }
    val children: LiveData<GetDetailsResponse> get() = _children


    private val _error by lazy { MutableLiveData<ErrorModel>() }
    val error: LiveData<ErrorModel> get() = _error

    fun getDetails() {
        viewModelScope.launch {
            getDetails.call("13545", onResult = object : UseCaseCallback<GetDetailsResponse> {
                override fun onSuccess(result: GetDetailsResponse) {
                    _children.value = result
                }

                override fun onError(errorModel: ErrorModel?) {
                    _error.value = errorModel
                }
            })
        }
    }

}