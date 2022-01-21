package com.android.testapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010\u001c\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001eH\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/android/testapp/ui/home/HomeFragment;", "Lcom/android/testapp/base/BaseFragment;", "Lcom/android/testapp/viewmodel/HomeViewModel;", "()V", "adapter", "Lcom/android/testapp/ui/home/PostsAdapter;", "getAdapter", "()Lcom/android/testapp/ui/home/PostsAdapter;", "setAdapter", "(Lcom/android/testapp/ui/home/PostsAdapter;)V", "articles", "Ljava/util/ArrayList;", "Lcom/android/testapp/model/ArticleBody;", "getArticles", "()Ljava/util/ArrayList;", "setArticles", "(Ljava/util/ArrayList;)V", "", "getViewModelType", "Ljava/lang/Class;", "layoutRes", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "setPostView", "it", "", "app_debug"})
public final class HomeFragment extends com.android.testapp.base.BaseFragment<com.android.testapp.viewmodel.HomeViewModel> {
    @org.jetbrains.annotations.Nullable()
    private com.android.testapp.ui.home.PostsAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.android.testapp.model.ArticleBody> articles;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.testapp.ui.home.PostsAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    com.android.testapp.ui.home.PostsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.testapp.model.ArticleBody> getArticles() {
        return null;
    }
    
    public final void setArticles(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.testapp.model.ArticleBody> p0) {
    }
    
    @java.lang.Override()
    protected int layoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Class<com.android.testapp.viewmodel.HomeViewModel> getViewModelType() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setPostView(java.util.List<com.android.testapp.model.ArticleBody> it) {
    }
    
    private final void getArticles() {
    }
    
    public HomeFragment() {
        super();
    }
}