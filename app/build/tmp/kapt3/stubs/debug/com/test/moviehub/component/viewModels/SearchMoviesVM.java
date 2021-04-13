package com.test.moviehub.component.viewModels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/test/moviehub/component/viewModels/SearchMoviesVM;", "Landroidx/lifecycle/ViewModel;", "searchMovies", "Lcom/test/moviehub/domain/SearchMovies;", "(Lcom/test/moviehub/domain/SearchMovies;)V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/test/moviehub/data/model/MovieResult;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SearchMoviesVM extends androidx.lifecycle.ViewModel {
    private final com.test.moviehub.domain.SearchMovies searchMovies = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.test.moviehub.data.model.MovieResult>>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchMoviesVM(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.SearchMovies searchMovies) {
        super();
    }
}