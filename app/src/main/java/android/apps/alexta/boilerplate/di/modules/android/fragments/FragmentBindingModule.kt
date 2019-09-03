package android.apps.alexta.boilerplate.di.modules.android.fragments

import android.apps.alexta.boilerplate.di.modules.android.lifecycle.LifecycleModule
import android.apps.alexta.boilerplate.di.scopes.android.FragmentScoped
import android.apps.alexta.boilerplate.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = [LifecycleModule::class])
    internal abstract fun bindMainFragment(): MainFragment

}