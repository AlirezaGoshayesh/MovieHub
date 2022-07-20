package com.test.moviehub.domain

import androidx.paging.PagingData
import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.data.model.MovieResult
import com.test.moviehub.domain.base.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetPopularMovies @Inject constructor(
    private val repository: Repository
) : UseCase<Any, Flow<PagingData<MovieResult>>>() {
    override suspend fun execute(parameters: Any): Flow<PagingData<MovieResult>> {
        val a = repository.getPopularMovies()
        return a
    }
}