package com.test.moviehub.domain

import androidx.paging.PagingData
import com.test.moviehub.data.model.MovieResult
import com.test.moviehub.domain.base.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchMovies @Inject constructor(
    private val repository: Repository
) : UseCase<String, Flow<PagingData<MovieResult>>>() {
    override suspend fun execute(parameters: String): Flow<PagingData<MovieResult>> {
        return repository.searchMovies(parameters)
    }
}