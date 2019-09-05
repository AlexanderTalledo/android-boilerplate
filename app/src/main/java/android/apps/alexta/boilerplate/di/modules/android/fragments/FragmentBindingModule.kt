package android.apps.alexta.boilerplate.di.modules.android.fragments

import android.apps.alexta.boilerplate.di.modules.android.adapters.AdaptersModule
import android.apps.alexta.boilerplate.di.modules.android.lifecycle.LifecycleModule
import android.apps.alexta.boilerplate.di.scopes.android.FragmentScoped
import android.apps.alexta.boilerplate.ui.main.MainFragment
import android.apps.alexta.boilerplate.ui.main.home.HomeFragment
import android.apps.alexta.boilerplate.ui.main.profile.ProfileFragment
import android.apps.alexta.boilerplate.ui.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = [LifecycleModule::class])
    internal abstract fun bindSplashFragment(): SplashFragment

    @FragmentScoped
    @ContributesAndroidInjector(modules = [LifecycleModule::class])
    internal abstract fun bindMainFragment(): MainFragment

    @FragmentScoped
    @ContributesAndroidInjector(modules = [LifecycleModule::class, AdaptersModule::class])
    internal abstract fun bindHomeFragment(): HomeFragment

    @FragmentScoped
    @ContributesAndroidInjector(modules = [LifecycleModule::class])
    internal abstract fun bindProfileFragment(): ProfileFragment

}