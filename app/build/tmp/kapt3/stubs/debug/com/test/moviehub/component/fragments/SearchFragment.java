package com.test.moviehub.component.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/test/moviehub/component/fragments/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "searchJob", "Lkotlinx/coroutines/Job;", "searchMoviesVM", "Lcom/test/moviehub/component/viewModels/SearchMoviesVM;", "getSearchMoviesVM", "()Lcom/test/moviehub/component/viewModels/SearchMoviesVM;", "searchMoviesVM$delegate", "Lkotlin/Lazy;", "searchResultsAdapter", "Lcom/test/moviehub/component/adapters/SearchResultsAdapter;", "getSearchResultsAdapter", "()Lcom/test/moviehub/component/adapters/SearchResultsAdapter;", "setSearchResultsAdapter", "(Lcom/test/moviehub/component/adapters/SearchResultsAdapter;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "parseView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public com.test.moviehub.component.adapters.SearchResultsAdapter searchResultsAdapter;
    private final kotlin.Lazy searchMoviesVM$delegate = null;
    private kotlinx.coroutines.Job searchJob;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.moviehub.component.adapters.SearchResultsAdapter getSearchResultsAdapter() {
        return null;
    }
    
    public final void setSearchResultsAdapter(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.component.adapters.SearchResultsAdapter p0) {
    }
    
    private final com.test.moviehub.component.viewModels.SearchMoviesVM getSearchMoviesVM() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void parseView() {
    }
    
    public SearchFragment() {
        super();
    }
}