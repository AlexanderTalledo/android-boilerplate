package android.apps.alexta.boilerplate.di.modules.android.lifecycle.viewmodels

import android.apps.alexta.boilerplate.ui.MainViewModel
import android.apps.alexta.boilerplate.ui.MainViewModelImpl
import dagger.Module
import dagger.Provides

@Module
class ViewModelsModule {

    @Provides
    internal fun provideMainViewModel(): MainViewModel = MainViewModelImpl()

}