package com.vada.parents.component.viewModels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0016R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/vada/parents/component/viewModels/GetDetailsVM;", "Landroidx/lifecycle/ViewModel;", "getDetails", "Lcom/test/moviehub/domain/GetDetails;", "(Lcom/test/moviehub/domain/GetDetails;)V", "_children", "Landroidx/lifecycle/MutableLiveData;", "Lcom/test/moviehub/data/model/GetDetailsResponse;", "get_children", "()Landroidx/lifecycle/MutableLiveData;", "_children$delegate", "Lkotlin/Lazy;", "_error", "Lcom/test/moviehub/domain/exceptions/ErrorModel;", "get_error", "_error$delegate", "children", "Landroidx/lifecycle/LiveData;", "getChildren", "()Landroidx/lifecycle/LiveData;", "error", "getError", "", "app_debug"})
public final class GetDetailsVM extends androidx.lifecycle.ViewModel {
    private final kotlin.Lazy _children$delegate = null;
    private final kotlin.Lazy _error$delegate = null;
    private final com.test.moviehub.domain.GetDetails getDetails = null;
    
    private final androidx.lifecycle.MutableLiveData<com.test.moviehub.data.model.GetDetailsResponse> get_children() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.test.moviehub.data.model.GetDetailsResponse> getChildren() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.test.moviehub.domain.exceptions.ErrorModel> get_error() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.test.moviehub.domain.exceptions.ErrorModel> getError() {
        return null;
    }
    
    public final void getDetails() {
    }
    
    @javax.inject.Inject()
    public GetDetailsVM(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.domain.GetDetails getDetails) {
        super();
    }
}