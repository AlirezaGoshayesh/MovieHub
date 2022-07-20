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

    /**
     * Called when search is performed to get the flow of paging data.
     * @param query The movie name to request.
     */
    suspend fun searchMovies(query: String): Flow<PagingData<MovieResult>> {
        return searchMovies.call(query).cachedIn(viewModelScope)
    }

    /**
     * Called when user first loads the app and get the flow of paging data.
     */
    suspend fun getPopularMovies(): Flow<PagingData<MovieResult>> {
        return getPopularMovies.call().cachedIn(viewModelScope)
    }

}