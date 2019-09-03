package android.apps.alexta.boilerplate.di.modules.android.lifecycle.viewmodels

import android.apps.alexta.boilerplate.ui.SplashViewModel
import android.apps.alexta.boilerplate.ui.SplashViewModelImpl
import android.apps.alexta.boilerplate.ui.main.MainViewModel
import android.apps.alexta.boilerplate.ui.main.MainViewModelImpl
import dagger.Module
import dagger.Provides

@Module
class ViewModelsModule {

    @Provides
    internal fun provideSplashViewModel(): SplashViewModel = SplashViewModelImpl()

    @Provides
    internal fun provideMainViewModel(): MainViewModel = MainViewModelImpl()

}