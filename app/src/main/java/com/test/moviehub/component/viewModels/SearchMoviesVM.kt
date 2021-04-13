package com.test.moviehub.component.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.test.moviehub.data.model.MovieResult
import com.test.moviehub.domain.SearchMovies
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class SearchMoviesVM @Inject constructor(
    private val searchMovies: SearchMovies
) : ViewModel() {

    suspend fun searchMovies(query: String): Flow<PagingData<MovieResult>> {
        return searchMovies.call(query).cachedIn(viewModelScope)
    }

}