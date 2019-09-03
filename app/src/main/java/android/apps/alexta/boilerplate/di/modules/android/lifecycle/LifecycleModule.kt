package android.apps.alexta.boilerplate.di.modules.android.lifecycle

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import android.apps.alexta.boilerplate.di.keys.android.lifecycle.ViewModelKey
import android.apps.alexta.boilerplate.di.modules.android.lifecycle.viewmodels.ViewModelsModule
import android.apps.alexta.boilerplate.di.scopes.ApplicationScoped
import android.apps.alexta.boilerplate.ui.MainViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(
    includes = [
        ViewModelsModule::class
    ]
)
abstract class LifecycleModule {

    @Binds
    @ApplicationScoped
    internal abstract fun bindViewModelFactory(
        baseViewModelFactory: BaseViewModelFactory
    ): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

}