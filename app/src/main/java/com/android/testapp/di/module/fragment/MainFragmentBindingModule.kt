package com.android.testapp.di.module.fragment

import com.android.testapp.ui.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentBindingModule {
    @ContributesAndroidInjector
    abstract fun provideHomeFragment(): HomeFragment
}