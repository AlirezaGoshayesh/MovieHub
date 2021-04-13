package com.test.moviehub.domain.base

import com.test.moviehub.domain.exceptions.ErrorModel

interface UseCaseCallback<Type> {

    fun onSuccess(result: Type)

    fun onError(errorModel: ErrorModel?)
}