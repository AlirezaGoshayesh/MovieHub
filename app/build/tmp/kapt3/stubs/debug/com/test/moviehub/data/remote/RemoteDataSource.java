package com.test.moviehub.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/test/moviehub/data/remote/RemoteDataSource;", "", "getDetails", "Lcom/test/moviehub/data/model/GetDetailsResponse;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/test/moviehub/data/model/MovieResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMovies", "searchKeyword", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String searchKeyword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.test.moviehub.data.model.MovieResult>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopularMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.test.moviehub.data.model.MovieResult>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDetails(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.test.moviehub.data.model.GetDetailsResponse> p1);
}