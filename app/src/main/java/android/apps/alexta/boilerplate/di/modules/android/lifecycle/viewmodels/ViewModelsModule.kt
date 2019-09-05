package android.apps.alexta.boilerplate.di.modules.android.lifecycle.viewmodels

import android.apps.alexta.boilerplate.repositories.HomeRepository
import android.apps.alexta.boilerplate.ui.main.MainViewModel
import android.apps.alexta.boilerplate.ui.main.MainViewModelImpl
import android.apps.alexta.boilerplate.ui.main.home.HomeViewModel
import android.apps.alexta.boilerplate.ui.main.home.HomeViewModelImpl
import android.apps.alexta.boilerplate.ui.main.profile.ProfileViewModel
import android.apps.alexta.boilerplate.ui.main.profile.ProfileViewModelImpl
import android.apps.alexta.boilerplate.ui.splash.SplashViewModel
import android.apps.alexta.boilerplate.ui.splash.SplashViewModelImpl
import dagger.Module
import dagger.Provides

@Module
class ViewModelsModule {

    @Provides
    internal fun provideSplashViewModel(): SplashViewModel = SplashViewModelImpl()

    @Provides
    internal fun provideMainViewModel(): MainViewModel = MainViewModelImpl()

    @Provides
    internal fun provideHomeViewModel(
        homeRepository: HomeRepository
    ): HomeViewModel = HomeViewModelImpl(homeRepository)

    @Provides
    internal fun provideProfileViewModel(): ProfileViewModel = ProfileViewModelImpl()

}