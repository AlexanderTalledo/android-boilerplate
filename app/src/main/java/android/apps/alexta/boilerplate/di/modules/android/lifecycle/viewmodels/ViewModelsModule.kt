package android.apps.alexta.boilerplate.di.modules.android.lifecycle.viewmodels

import android.apps.alexta.boilerplate.di.modules.repositories.RepositoriesModule
import android.apps.alexta.boilerplate.ui.main.MainViewModel
import android.apps.alexta.boilerplate.ui.main.MainViewModelImpl
import android.apps.alexta.boilerplate.ui.main.home.HomeViewModel
import android.apps.alexta.boilerplate.ui.main.home.HomeViewModelImpl
import android.apps.alexta.boilerplate.ui.main.home.details.HomeDetailsViewModel
import android.apps.alexta.boilerplate.ui.main.home.details.HomeDetailsViewModelImpl
import android.apps.alexta.boilerplate.ui.main.profile.ProfileViewModel
import android.apps.alexta.boilerplate.ui.main.profile.ProfileViewModelImpl
import android.apps.alexta.boilerplate.ui.splash.SplashViewModel
import android.apps.alexta.boilerplate.ui.splash.SplashViewModelImpl
import dagger.Binds
import dagger.Module

@Module(includes = [RepositoriesModule::class])
abstract class ViewModelsModule {

    @Binds
    internal abstract fun provideSplashViewModel(
        splashViewModelImpl: SplashViewModelImpl
    ): SplashViewModel

    @Binds
    internal abstract fun provideMainViewModel(mainViewModelImpl: MainViewModelImpl): MainViewModel

    @Binds
    internal abstract fun provideHomeViewModel(homeViewModelImpl: HomeViewModelImpl): HomeViewModel

    @Binds
    internal abstract fun provideHomeDetailsViewModel(
        homeDetailsViewModelImpl: HomeDetailsViewModelImpl
    ): HomeDetailsViewModel

    @Binds
    internal abstract fun provideProfileViewModel(
        profileViewModelImpl: ProfileViewModelImpl
    ): ProfileViewModel

}