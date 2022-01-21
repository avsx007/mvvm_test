package com.android.testapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/android/testapp/di/ApplicationComponent;", "Ldagger/android/AndroidInjector;", "Ldagger/android/support/DaggerApplication;", "inject", "", "app", "Lcom/android/testapp/base/BaseApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {com.android.testapp.di.module.ContextModule.class, dagger.android.support.AndroidSupportInjectionModule.class, com.android.testapp.di.module.ApplicationModule.class, com.android.testapp.di.module.ActivityBindingModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent extends dagger.android.AndroidInjector<dagger.android.support.DaggerApplication> {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.android.testapp.base.BaseApplication app);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/testapp/di/ApplicationComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/android/testapp/di/ApplicationComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.android.testapp.di.ApplicationComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.android.testapp.di.ApplicationComponent build();
    }
}