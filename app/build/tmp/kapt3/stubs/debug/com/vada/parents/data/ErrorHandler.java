package com.vada.parents.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/vada/parents/data/ErrorHandler;", "Lcom/test/moviehub/domain/exceptions/IErrorHandler;", "()V", "getHttpError", "Lcom/test/moviehub/domain/exceptions/ErrorModel;", "body", "Lokhttp3/ResponseBody;", "code", "", "handleException", "throwable", "", "app_debug"})
public final class ErrorHandler implements com.test.moviehub.domain.exceptions.IErrorHandler {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.test.moviehub.domain.exceptions.ErrorModel handleException(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
        return null;
    }
    
    /**
     * attempts to parse http response body and get error data from it
     *
     * @param body retrofit response body
     * @return returns an instance of [ErrorModel] with parsed data or NOT_DEFINED status
     */
    private final com.test.moviehub.domain.exceptions.ErrorModel getHttpError(okhttp3.ResponseBody body, int code) {
        return null;
    }
    
    public ErrorHandler() {
        super();
    }
}