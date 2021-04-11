package com.vada.parents.data

import com.test.moviehub.domain.exceptions.ErrorModel
import com.test.moviehub.domain.exceptions.IErrorHandler
import kotlinx.coroutines.CancellationException
import okhttp3.ResponseBody
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException

class ErrorHandler : IErrorHandler {

    override fun handleException(throwable: Throwable?): ErrorModel {
        val errorModel: ErrorModel? = when (throwable) {

            // if throwable is an instance of HttpException
            // then attempt to parse error data from response body
            is HttpException -> {
                getHttpError(throwable.response()?.errorBody(), throwable.code())
            }

            is CancellationException -> {
                ErrorModel(
                    "Canceled by user!",
                    0,
                    ErrorModel.ErrorStatus.CANCELED
                )
            }

            // handle api call timeout error
            is SocketTimeoutException -> {
                ErrorModel(
                    throwable.message,
                    ErrorModel.ErrorStatus.TIMEOUT
                )
            }

            // handle connection error
            is IOException -> {
                ErrorModel(
                    throwable.message,
                    ErrorModel.ErrorStatus.NO_CONNECTION
                )
            }
            else -> null
        }
        return errorModel ?: ErrorModel(
            "No Defined Error!",
            0,
            ErrorModel.ErrorStatus.BAD_RESPONSE
        )
    }

    /**
     * attempts to parse http response body and get error data from it
     *
     * @param body retrofit response body
     * @return returns an instance of [ErrorModel] with parsed data or NOT_DEFINED status
     */
    private fun getHttpError(body: ResponseBody?, code: Int): ErrorModel {
        return try {
            when (code) {
                401 -> ErrorModel(
                    body.toString(),
                    code,
                    ErrorModel.ErrorStatus.UNAUTHORIZED
                )
                404 -> ErrorModel(
                    body.toString(),
                    code,
                    ErrorModel.ErrorStatus.EMPTY_RESPONSE
                )
                403 -> ErrorModel(
                    body.toString(),
                    code,
                    ErrorModel.ErrorStatus.UNAUTHORIZED
                )
                429 -> ErrorModel(
                    body.toString(),
                    code,
                    ErrorModel.ErrorStatus.TOO_MANY_ATTEMPTS
                )
                in 500..599 -> ErrorModel(
                    body.toString(),
                    500,
                    ErrorModel.ErrorStatus.BAD_RESPONSE
                )
                else -> ErrorModel(
                    message = body.toString(),
                    errorStatus = ErrorModel.ErrorStatus.NOT_DEFINED
                )

            }
        } catch (e: Throwable) {
            e.printStackTrace()
            ErrorModel(
                message = e.message,
                errorStatus = ErrorModel.ErrorStatus.NOT_DEFINED
            )
        }

    }
}