package com.test.moviehub.domain.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J0\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\u001b\u001a\u00020\u0006J\t\u0010\u001c\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/test/moviehub/domain/exceptions/ErrorModel;", "", "errorStatus", "Lcom/test/moviehub/domain/exceptions/ErrorModel$ErrorStatus;", "(Lcom/test/moviehub/domain/exceptions/ErrorModel$ErrorStatus;)V", "message", "", "(Ljava/lang/String;Lcom/test/moviehub/domain/exceptions/ErrorModel$ErrorStatus;)V", "code", "", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/test/moviehub/domain/exceptions/ErrorModel$ErrorStatus;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorStatus", "()Lcom/test/moviehub/domain/exceptions/ErrorModel$ErrorStatus;", "setErrorStatus", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/test/moviehub/domain/exceptions/ErrorModel$ErrorStatus;)Lcom/test/moviehub/domain/exceptions/ErrorModel;", "equals", "", "other", "getErrorMessage", "hashCode", "toString", "ErrorStatus", "app_debug"})
public final class ErrorModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer code = null;
    @org.jetbrains.annotations.NotNull()
    private com.test.moviehub.domain.exceptions.ErrorModel.ErrorStatus errorStatus;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.moviehub.domain.exceptions.ErrorModel.ErrorStatus getErrorStatus() {
        return null;
    }
    
    public final void setErrorStatus(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.exceptions.ErrorModel.ErrorStatus p0) {
    }
    
    public ErrorModel(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer code, @org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.exceptions.ErrorModel.ErrorStatus errorStatus) {
        super();
    }
    
    public ErrorModel(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.exceptions.ErrorModel.ErrorStatus errorStatus) {
        super();
    }
    
    public ErrorModel(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.exceptions.ErrorModel.ErrorStatus errorStatus) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.moviehub.domain.exceptions.ErrorModel.ErrorStatus component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.moviehub.domain.exceptions.ErrorModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer code, @org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.exceptions.ErrorModel.ErrorStatus errorStatus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/test/moviehub/domain/exceptions/ErrorModel$ErrorStatus;", "", "(Ljava/lang/String;I)V", "NO_CONNECTION", "BAD_RESPONSE", "TIMEOUT", "EMPTY_RESPONSE", "NOT_DEFINED", "UNAUTHORIZED", "CANCELED", "TOO_MANY_ATTEMPTS", "app_debug"})
    public static enum ErrorStatus {
        /*public static final*/ NO_CONNECTION /* = new NO_CONNECTION() */,
        /*public static final*/ BAD_RESPONSE /* = new BAD_RESPONSE() */,
        /*public static final*/ TIMEOUT /* = new TIMEOUT() */,
        /*public static final*/ EMPTY_RESPONSE /* = new EMPTY_RESPONSE() */,
        /*public static final*/ NOT_DEFINED /* = new NOT_DEFINED() */,
        /*public static final*/ UNAUTHORIZED /* = new UNAUTHORIZED() */,
        /*public static final*/ CANCELED /* = new CANCELED() */,
        /*public static final*/ TOO_MANY_ATTEMPTS /* = new TOO_MANY_ATTEMPTS() */;
        
        ErrorStatus() {
        }
    }
}