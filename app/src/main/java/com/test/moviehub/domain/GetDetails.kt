package com.test.moviehub.domain

import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.domain.base.UseCase
import com.test.moviehub.domain.exceptions.IErrorHandler
import javax.inject.Inject

class GetDetails @Inject constructor(
    private val repository: Repository
) : UseCase<Int, GetDetailsResponse>() {
    override suspend fun execute(parameters: Int): GetDetailsResponse {
        return repository.getDetails(parameters)
    }
}