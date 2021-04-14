package com.test.moviehub.component.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-H\u0016J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0012\u00106\u001a\u00020\u00152\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u00109\u001a\u00020\u00152\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u0010<\u001a\u00020\u0005H\u0002J\b\u0010=\u001a\u00020\u0005H\u0002J\u0014\u0010>\u001a\u00020\u00052\n\b\u0002\u0010?\u001a\u0004\u0018\u000108H\u0002R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006@"}, d2 = {"Lcom/test/moviehub/component/fragments/SearchFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/widget/SearchView$OnQueryTextListener;", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "", "Lcom/test/moviehub/component/adapters/SearchResultsAdapter$ItemListOnClickListener;", "()V", "binding", "Lcom/test/moviehub/databinding/FragmentSearchBinding;", "getBinding", "()Lcom/test/moviehub/databinding/FragmentSearchBinding;", "setBinding", "(Lcom/test/moviehub/databinding/FragmentSearchBinding;)V", "getDetailsVM", "Lcom/test/moviehub/component/viewModels/GetDetailsVM;", "getGetDetailsVM", "()Lcom/test/moviehub/component/viewModels/GetDetailsVM;", "getDetailsVM$delegate", "Lkotlin/Lazy;", "isClicked", "", "loadingDialog", "Lcom/test/moviehub/component/dialogs/LoadingDialog;", "getLoadingDialog", "()Lcom/test/moviehub/component/dialogs/LoadingDialog;", "setLoadingDialog", "(Lcom/test/moviehub/component/dialogs/LoadingDialog;)V", "mJob", "Lkotlinx/coroutines/Job;", "searchFragmentVM", "Lcom/test/moviehub/component/viewModels/SearchFragmentVM;", "getSearchFragmentVM", "()Lcom/test/moviehub/component/viewModels/SearchFragmentVM;", "searchFragmentVM$delegate", "searchResultsAdapter", "Lcom/test/moviehub/component/adapters/SearchResultsAdapter;", "getSearchResultsAdapter", "()Lcom/test/moviehub/component/adapters/SearchResultsAdapter;", "setSearchResultsAdapter", "(Lcom/test/moviehub/component/adapters/SearchResultsAdapter;)V", "invoke", "loadState", "onClick", "id", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onQueryTextChange", "p0", "", "onQueryTextSubmit", "onViewCreated", "view", "parseView", "registerObserver", "search", "query", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFragment extends androidx.fragment.app.Fragment implements android.widget.SearchView.OnQueryTextListener, kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit>, com.test.moviehub.component.adapters.SearchResultsAdapter.ItemListOnClickListener {
    public com.test.moviehub.databinding.FragmentSearchBinding binding;
    @javax.inject.Inject()
    public com.test.moviehub.component.dialogs.LoadingDialog loadingDialog;
    @javax.inject.Inject()
    public com.test.moviehub.component.adapters.SearchResultsAdapter searchResultsAdapter;
    private final kotlin.Lazy searchFragmentVM$delegate = null;
    private final kotlin.Lazy getDetailsVM$delegate = null;
    private kotlinx.coroutines.Job mJob;
    private boolean isClicked = false;
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
    
    private final com.test.moviehub.component.viewModels.SearchFragmentVM getSearchFragmentVM() {
        return null;
    }
    
    private final com.test.moviehub.component.viewModels.GetDetailsVM getGetDetailsVM() {
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
    
    private final void registerObserver() {
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
    
    @java.lang.Override()
    public void onClick(int id) {
    }
    
    public SearchFragment() {
        super();
    }
}