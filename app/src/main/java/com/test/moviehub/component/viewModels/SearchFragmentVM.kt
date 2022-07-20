package com.test.moviehub.component.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.data.model.MovieResult
import com.test.moviehub.domain.GetPopularMovies
import com.test.moviehub.domain.SearchMovies
import com.test.moviehub.domain.base.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchFragmentVM @Inject constructor(
    private val searchMovies: SearchMovies,
    private val getPopularMovies: GetPopularMovies
) : ViewModel() {

    private val _movies =
        MutableStateFlow<Resource<Flow<PagingData<MovieResult>>>>(Resource.Loading)
    val movies: StateFlow<Resource<Flow<PagingData<MovieResult>>>> get() = _movies

    /**
     * Called when search is performed to get the flow of paging data.
     * @param query The movie name to request.
     */
    fun search(query: String) {
        viewModelScope.launch {
            _movies.value = (searchMovies(query))
        }
    }

    /**
     * Called when user first loads the app and get the flow of paging data.
     */
    fun getPopular() {
        viewModelScope.launch {
            _movies.value = (getPopularMovies(0))
        }
    }

}