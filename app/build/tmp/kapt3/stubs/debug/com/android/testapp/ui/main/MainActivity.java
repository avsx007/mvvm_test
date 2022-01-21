package com.android.testapp.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0006\u0010\u0010\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J*\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/android/testapp/ui/main/MainActivity;", "Lcom/android/testapp/base/BaseActivity;", "Lcom/android/testapp/viewmodel/MainViewModel;", "()V", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "homeFragment", "Lcom/android/testapp/ui/home/HomeFragment;", "clearBackStack", "", "getViewModelType", "Ljava/lang/Class;", "layoutRes", "", "navigateToHome", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "replaceFragment", "fragment", "Landroidx/fragment/app/Fragment;", "name", "", "bundle", "addToBackStack", "", "app_debug"})
public final class MainActivity extends com.android.testapp.base.BaseActivity<com.android.testapp.viewmodel.MainViewModel> {
    private androidx.fragment.app.FragmentManager fragmentManager;
    private androidx.fragment.app.FragmentTransaction fragmentTransaction;
    private com.android.testapp.ui.home.HomeFragment homeFragment;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int layoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Class<com.android.testapp.viewmodel.MainViewModel> getViewModelType() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void navigateToHome() {
    }
    
    private final void replaceFragment(androidx.fragment.app.Fragment fragment, java.lang.String name, android.os.Bundle bundle, boolean addToBackStack) {
    }
    
    public final void clearBackStack() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public MainActivity() {
        super();
    }
}