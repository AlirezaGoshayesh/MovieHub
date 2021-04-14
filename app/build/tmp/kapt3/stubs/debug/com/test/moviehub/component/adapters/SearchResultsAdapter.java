package com.test.moviehub.component.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0011\u0012\u0013B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/test/moviehub/component/adapters/SearchResultsAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/test/moviehub/data/model/MovieResult;", "Lcom/test/moviehub/component/adapters/SearchResultsAdapter$MovieResultViewHolder;", "()V", "onClickListener", "Lcom/test/moviehub/component/adapters/SearchResultsAdapter$ItemListOnClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickListener", "ItemListOnClickListener", "MovieResultViewHolder", "SearchResultsComparator", "app_debug"})
@javax.inject.Singleton()
public final class SearchResultsAdapter extends androidx.paging.PagingDataAdapter<com.test.moviehub.data.model.MovieResult, com.test.moviehub.component.adapters.SearchResultsAdapter.MovieResultViewHolder> {
    private com.test.moviehub.component.adapters.SearchResultsAdapter.ItemListOnClickListener onClickListener;
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.component.adapters.SearchResultsAdapter.ItemListOnClickListener onClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.test.moviehub.component.adapters.SearchResultsAdapter.MovieResultViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.component.adapters.SearchResultsAdapter.MovieResultViewHolder holder, int position) {
    }
    
    @javax.inject.Inject()
    public SearchResultsAdapter() {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/test/moviehub/component/adapters/SearchResultsAdapter$ItemListOnClickListener;", "", "onClick", "", "id", "", "app_debug"})
    public static abstract interface ItemListOnClickListener {
        
        public abstract void onClick(int id);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/test/moviehub/component/adapters/SearchResultsAdapter$MovieResultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/test/moviehub/databinding/ItemMoviewBinding;", "(Lcom/test/moviehub/component/adapters/SearchResultsAdapter;Lcom/test/moviehub/databinding/ItemMoviewBinding;)V", "bindMovie", "", "item", "Lcom/test/moviehub/data/model/MovieResult;", "app_debug"})
    public final class MovieResultViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.test.moviehub.databinding.ItemMoviewBinding binding = null;
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bindMovie(@org.jetbrains.annotations.NotNull()
        com.test.moviehub.data.model.MovieResult item) {
        }
        
        public MovieResultViewHolder(@org.jetbrains.annotations.NotNull()
        com.test.moviehub.databinding.ItemMoviewBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/test/moviehub/component/adapters/SearchResultsAdapter$SearchResultsComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/test/moviehub/data/model/MovieResult;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class SearchResultsComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.test.moviehub.data.model.MovieResult> {
        @org.jetbrains.annotations.NotNull()
        public static final com.test.moviehub.component.adapters.SearchResultsAdapter.SearchResultsComparator INSTANCE = null;
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.test.moviehub.data.model.MovieResult oldItem, @org.jetbrains.annotations.NotNull()
        com.test.moviehub.data.model.MovieResult newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.test.moviehub.data.model.MovieResult oldItem, @org.jetbrains.annotations.NotNull()
        com.test.moviehub.data.model.MovieResult newItem) {
            return false;
        }
        
        private SearchResultsComparator() {
            super();
        }
    }
}