package android.apps.alexta.boilerplate.di.modules.android.lifecycle.viewmodels

import android.apps.alexta.boilerplate.ui.MainViewModel
import android.apps.alexta.boilerplate.ui.MainViewModelImpl
import android.apps.alexta.boilerplate.ui.splash.SplashViewModel
import android.apps.alexta.boilerplate.ui.splash.SplashViewModelImpl
import dagger.Module
import dagger.Provides

@Module
class ViewModelsModule {

    @Provides
    internal fun provideMainViewModel(): MainViewModel = MainViewModelImpl()

    @Provides
    internal fun provideSplashViewModel(): SplashViewModel = SplashViewModelImpl()

}