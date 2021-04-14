package com.test.moviehub.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/test/moviehub/domain/GetDetails;", "Lcom/test/moviehub/domain/base/UseCase;", "Lcom/test/moviehub/data/model/GetDetailsResponse;", "", "repository", "Lcom/test/moviehub/domain/Repository;", "errorHandler", "Lcom/test/moviehub/domain/exceptions/IErrorHandler;", "(Lcom/test/moviehub/domain/Repository;Lcom/test/moviehub/domain/exceptions/IErrorHandler;)V", "run", "params", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetDetails extends com.test.moviehub.domain.base.UseCase<com.test.moviehub.data.model.GetDetailsResponse, java.lang.Integer> {
    private final com.test.moviehub.domain.Repository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object run(@org.jetbrains.annotations.Nullable()
    java.lang.Integer params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.test.moviehub.data.model.GetDetailsResponse> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public GetDetails(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.Repository repository, @org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.exceptions.IErrorHandler errorHandler) {
        super(null);
    }
}