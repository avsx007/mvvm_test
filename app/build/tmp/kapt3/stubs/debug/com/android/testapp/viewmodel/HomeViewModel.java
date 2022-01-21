package com.android.testapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/android/testapp/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/android/testapp/data/repository/DataRepository;", "(Lcom/android/testapp/data/repository/DataRepository;)V", "getDataRepository", "()Lcom/android/testapp/data/repository/DataRepository;", "getArticles", "", "getArticlesObserver", "Landroidx/lifecycle/LiveData;", "", "Lcom/android/testapp/model/ArticleBody;", "getError", "", "getLoading", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.android.testapp.data.repository.DataRepository dataRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.android.testapp.model.ArticleBody>> getArticlesObserver() {
        return null;
    }
    
    public final void getArticles() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.testapp.data.repository.DataRepository getDataRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.android.testapp.data.repository.DataRepository dataRepository) {
        super();
    }
}