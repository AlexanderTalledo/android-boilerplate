package android.apps.alexta.boilerplate.di.modules.android.lifecycle

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import android.apps.alexta.boilerplate.di.keys.android.lifecycle.ViewModelKey
import android.apps.alexta.boilerplate.di.modules.android.lifecycle.viewmodels.ViewModelsModule
import android.apps.alexta.boilerplate.di.scopes.ApplicationScoped
import android.apps.alexta.boilerplate.ui.main.MainViewModel
import android.apps.alexta.boilerplate.ui.main.home.HomeViewModel
import android.apps.alexta.boilerplate.ui.main.profile.ProfileViewModel
import android.apps.alexta.boilerplate.ui.splash.SplashViewModel
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
    @ViewModelKey(SplashViewModel::class)
    internal abstract fun bindSplashViewModel(splashViewModel: SplashViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    internal abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    internal abstract fun bindProfileViewModel(profileViewModel: ProfileViewModel): ViewModel

}