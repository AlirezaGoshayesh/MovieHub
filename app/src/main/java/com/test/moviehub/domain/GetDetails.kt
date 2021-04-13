package com.test.moviehub.domain

import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.domain.base.UseCase
import com.test.moviehub.domain.exceptions.IErrorHandler
import javax.inject.Inject

class GetDetails @Inject constructor(
    private val repository: Repository,
    errorHandler: IErrorHandler
) : UseCase<GetDetailsResponse, String>(errorHandler) {
    override suspend fun run(params: String?): GetDetailsResponse {
        return repository.getDetails(params!!)
    }
}