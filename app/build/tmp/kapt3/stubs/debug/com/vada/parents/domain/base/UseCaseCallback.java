package com.vada.parents.domain.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/vada/parents/domain/base/UseCaseCallback;", "Type", "", "onError", "", "errorModel", "Lcom/test/moviehub/domain/exceptions/ErrorModel;", "onSuccess", "result", "(Ljava/lang/Object;)V", "app_debug"})
public abstract interface UseCaseCallback<Type extends java.lang.Object> {
    
    public abstract void onSuccess(Type result);
    
    public abstract void onError(@org.jetbrains.annotations.Nullable()
    com.test.moviehub.domain.exceptions.ErrorModel errorModel);
}