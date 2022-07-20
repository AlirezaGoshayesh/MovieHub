package com.test.moviehub.domain

import androidx.paging.PagingData
import com.test.moviehub.data.model.MovieResult
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetPopularMovies @Inject constructor(
    private val repository: Repository
) {
    suspend fun call(): Flow<PagingData<MovieResult>> = repository.getPopularMovies()
}