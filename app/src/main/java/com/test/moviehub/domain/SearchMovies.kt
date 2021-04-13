package com.test.moviehub.domain

import androidx.paging.PagingData
import com.test.moviehub.data.model.MovieResult
import com.test.moviehub.domain.exceptions.IErrorHandler
import com.test.moviehub.domain.base.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchMovies @Inject constructor(
    private val repository: Repository,
    errorHandler: IErrorHandler
) : UseCase<Flow<PagingData<MovieResult>>, String>(errorHandler) {
    override suspend fun run(params: String?): Flow<PagingData<MovieResult>> {
        return repository.searchMovies(params!!)
    }
}