package com.test.moviehub.domain.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/test/moviehub/domain/exceptions/IErrorHandler;", "", "handleException", "Lcom/test/moviehub/domain/exceptions/ErrorModel;", "throwable", "", "app_debug"})
public abstract interface IErrorHandler {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.test.moviehub.domain.exceptions.ErrorModel handleException(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable);
}