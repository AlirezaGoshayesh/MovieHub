package com.test.moviehub.component.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0004H\u0096\u0002J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010/\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00102\u001a\u00020\u0005H\u0002J\u0014\u00103\u001a\u00020\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010.H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00065"}, d2 = {"Lcom/test/moviehub/component/fragments/SearchFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/widget/SearchView$OnQueryTextListener;", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "", "()V", "binding", "Lcom/test/moviehub/databinding/FragmentSearchBinding;", "getBinding", "()Lcom/test/moviehub/databinding/FragmentSearchBinding;", "setBinding", "(Lcom/test/moviehub/databinding/FragmentSearchBinding;)V", "loadingDialog", "Lcom/test/moviehub/component/dialogs/LoadingDialog;", "getLoadingDialog", "()Lcom/test/moviehub/component/dialogs/LoadingDialog;", "setLoadingDialog", "(Lcom/test/moviehub/component/dialogs/LoadingDialog;)V", "searchJob", "Lkotlinx/coroutines/Job;", "searchMoviesVM", "Lcom/test/moviehub/component/viewModels/SearchMoviesVM;", "getSearchMoviesVM", "()Lcom/test/moviehub/component/viewModels/SearchMoviesVM;", "searchMoviesVM$delegate", "Lkotlin/Lazy;", "searchResultsAdapter", "Lcom/test/moviehub/component/adapters/SearchResultsAdapter;", "getSearchResultsAdapter", "()Lcom/test/moviehub/component/adapters/SearchResultsAdapter;", "setSearchResultsAdapter", "(Lcom/test/moviehub/component/adapters/SearchResultsAdapter;)V", "invoke", "loadState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onQueryTextChange", "", "p0", "", "onQueryTextSubmit", "onViewCreated", "view", "parseView", "search", "query", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFragment extends androidx.fragment.app.Fragment implements android.widget.SearchView.OnQueryTextListener, kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit> {
    public com.test.moviehub.databinding.FragmentSearchBinding binding;
    @javax.inject.Inject()
    public com.test.moviehub.component.dialogs.LoadingDialog loadingDialog;
    @javax.inject.Inject()
    public com.test.moviehub.component.adapters.SearchResultsAdapter searchResultsAdapter;
    private final kotlin.Lazy searchMoviesVM$delegate = null;
    private kotlinx.coroutines.Job searchJob;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.moviehub.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.databinding.FragmentSearchBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.moviehub.component.dialogs.LoadingDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.component.dialogs.LoadingDialog p0) {
    }
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void parseView() {
    }
    
    private final void search(java.lang.String query) {
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
        return false;
    }
    
    @java.lang.Override()
    public void invoke(@org.jetbrains.annotations.NotNull()
    androidx.paging.CombinedLoadStates loadState) {
    }
    
    public SearchFragment() {
        super();
    }
}