package com.test.moviehub.domain

import androidx.paging.PagingData
import com.test.moviehub.data.model.MovieResult
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchMovies @Inject constructor(
    private val repository: Repository
) {
    suspend fun call(query: String): Flow<PagingData<MovieResult>> = repository.searchMovies(query)
}