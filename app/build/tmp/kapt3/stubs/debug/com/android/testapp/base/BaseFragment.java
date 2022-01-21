package com.android.testapp.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H$J\b\u0010\u0013\u001a\u00020\u0014H%J\u0006\u0010\u0015\u001a\u00020\u0016J(\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/android/testapp/base/BaseFragment;", "VM", "Landroidx/lifecycle/ViewModel;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "setViewModel", "(Landroidx/lifecycle/ViewModel;)V", "Landroidx/lifecycle/ViewModel;", "viewModelFactory", "Lcom/android/testapp/di/util/ViewModelFactory;", "getViewModelFactory", "()Lcom/android/testapp/di/util/ViewModelFactory;", "setViewModelFactory", "(Lcom/android/testapp/di/util/ViewModelFactory;)V", "getViewModelType", "Ljava/lang/Class;", "layoutRes", "", "navigator", "Lcom/android/testapp/ui/main/MainActivity;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "app_debug"})
public abstract class BaseFragment<VM extends androidx.lifecycle.ViewModel> extends dagger.android.support.DaggerFragment {
    @javax.inject.Inject()
    public com.android.testapp.di.util.ViewModelFactory viewModelFactory;
    protected VM viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @androidx.annotation.LayoutRes()
    protected abstract int layoutRes();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<VM> getViewModelType();
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.testapp.di.util.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.android.testapp.di.util.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.testapp.ui.main.MainActivity navigator() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public BaseFragment() {
        super();
    }
}