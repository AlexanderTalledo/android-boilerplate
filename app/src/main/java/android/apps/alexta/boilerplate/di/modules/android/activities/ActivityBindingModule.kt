package android.apps.alexta.boilerplate.di.modules.android.activities

import android.apps.alexta.boilerplate.ui.MainActivity
import android.apps.alexta.boilerplate.di.modules.android.lifecycle.LifecycleModule
import android.apps.alexta.boilerplate.di.scopes.android.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [LifecycleModule::class])
    internal abstract fun bindMainActivity(): MainActivity

}