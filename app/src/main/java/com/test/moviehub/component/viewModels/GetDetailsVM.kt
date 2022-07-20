package com.test.moviehub.component.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.domain.GetDetails
import com.test.moviehub.domain.base.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GetDetailsVM @Inject constructor(
    private val getDetails: GetDetails
) : ViewModel() {

    private val _movie = MutableSharedFlow<Resource<GetDetailsResponse>>()
    val movie: SharedFlow<Resource<GetDetailsResponse>> get() = _movie

    /**
     * Called to get details of the movie.
     * @param id The movie id to request further details.
     */
    fun getDetailsOfMovie(id: Int) {
        viewModelScope.launch {
            _movie.emit(getDetails(id))
        }

    }
}