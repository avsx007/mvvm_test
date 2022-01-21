package com.android.testapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/android/testapp/di/module/ApplicationModule;", "", "()V", "Companion", "app_debug"})
@dagger.Module(includes = {com.android.testapp.di.module.ViewModelModule.class})
public final class ApplicationModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPLICATION_CONTEXT = "application.context";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVER_KEY = "fd78102346e84058b2e52185ca2c9606";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://newsapi.org/v2/";
    @org.jetbrains.annotations.NotNull()
    public static final com.android.testapp.di.module.ApplicationModule.Companion Companion = null;
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.android.testapp.data.webservice.RestService provideRetrofitService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/android/testapp/di/module/ApplicationModule$Companion;", "", "()V", "APPLICATION_CONTEXT", "", "BASE_URL", "SERVER_KEY", "provideRetrofit", "Lretrofit2/Retrofit;", "provideRetrofitService", "Lcom/android/testapp/data/webservice/RestService;", "retrofit", "app_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        @javax.inject.Singleton()
        public final retrofit2.Retrofit provideRetrofit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        @javax.inject.Singleton()
        public final com.android.testapp.data.webservice.RestService provideRetrofitService(@org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}