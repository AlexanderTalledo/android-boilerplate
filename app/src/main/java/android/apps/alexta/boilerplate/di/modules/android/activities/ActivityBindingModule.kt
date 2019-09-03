package android.apps.alexta.boilerplate.di.modules.android.activities

import android.apps.alexta.boilerplate.di.scopes.android.ActivityScoped
import android.apps.alexta.boilerplate.ui.ApplicationActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector
    internal abstract fun bindApplicationActivity(): ApplicationActivity

}