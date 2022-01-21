package com.android.testapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/android/testapp/data/repository/DataRepository;", "", "restService", "Lcom/android/testapp/data/webservice/RestService;", "(Lcom/android/testapp/data/webservice/RestService;)V", "articlesMutable", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/android/testapp/model/ArticleBody;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "repoLoadError", "", "repoLoading", "", "getRestService", "()Lcom/android/testapp/data/webservice/RestService;", "getArticles", "", "getArticlesObserver", "Landroidx/lifecycle/LiveData;", "getError", "getLoading", "app_debug"})
@javax.inject.Singleton()
public final class DataRepository {
    private io.reactivex.disposables.CompositeDisposable disposable;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> repoLoading;
    private androidx.lifecycle.MutableLiveData<java.lang.String> repoLoadError;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.android.testapp.model.ArticleBody>> articlesMutable;
    @org.jetbrains.annotations.NotNull()
    private final com.android.testapp.data.webservice.RestService restService = null;
    
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
    public final com.android.testapp.data.webservice.RestService getRestService() {
        return null;
    }
    
    @javax.inject.Inject()
    public DataRepository(@org.jetbrains.annotations.NotNull()
    com.android.testapp.data.webservice.RestService restService) {
        super();
    }
}