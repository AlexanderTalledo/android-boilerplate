package android.apps.alexta.boilerplate.di.modules.android.lifecycle

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import android.apps.alexta.boilerplate.di.scopes.ApplicationScoped
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelsModule {

    @Binds
    @ApplicationScoped
    internal abstract fun bindViewModelFactory(
        baseViewModelFactory: BaseViewModelFactory
    ): ViewModelProvider.Factory

}