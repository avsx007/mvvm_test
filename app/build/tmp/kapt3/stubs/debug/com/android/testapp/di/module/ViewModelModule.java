package com.android.testapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/android/testapp/di/module/ViewModelModule;", "", "()V", "bindHomeViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/android/testapp/viewmodel/HomeViewModel;", "bindMainViewModel", "Lcom/android/testapp/viewmodel/MainViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/android/testapp/di/util/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.android.testapp.di.util.ViewModelKey(value = com.android.testapp.viewmodel.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMainViewModel(@org.jetbrains.annotations.NotNull()
    com.android.testapp.viewmodel.MainViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.android.testapp.di.util.ViewModelKey(value = com.android.testapp.viewmodel.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.android.testapp.viewmodel.HomeViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.android.testapp.di.util.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}