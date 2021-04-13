package com.vada.parents.domain.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u000fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J-\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u00012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u00028\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/vada/parents/domain/base/UseCase;", "Response", "Params", "", "errorHandler", "Lcom/test/moviehub/domain/exceptions/IErrorHandler;", "(Lcom/test/moviehub/domain/exceptions/IErrorHandler;)V", "call", "", "params", "onResult", "Lcom/vada/parents/domain/base/UseCaseCallback;", "(Ljava/lang/Object;Lcom/vada/parents/domain/base/UseCaseCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "run", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract class UseCase<Response extends java.lang.Object, Params extends java.lang.Object> {
    private final com.test.moviehub.domain.exceptions.IErrorHandler errorHandler = null;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vada.parents.domain.base.UseCase.Companion Companion = null;
    
    /**
     * every usecase must implement this method for implement business core
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object run(@org.jetbrains.annotations.Nullable()
    Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super Response> p1);
    
    /**
     * an interface that presentation layer work with this
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object call(@org.jetbrains.annotations.Nullable()
    Params params, @org.jetbrains.annotations.Nullable()
    com.vada.parents.domain.base.UseCaseCallback<Response> onResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    public UseCase(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.exceptions.IErrorHandler errorHandler) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/vada/parents/domain/base/UseCase$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}