package com.test.moviehub.domain.exceptions

interface IErrorHandler {
    fun handleException(throwable: Throwable?): ErrorModel
}