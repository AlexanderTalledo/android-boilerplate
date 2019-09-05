package android.apps.alexta.boilerplate.di.modules.android.adapters

import android.apps.alexta.boilerplate.adapters.HomeAdapter
import dagger.Module
import dagger.Provides

@Module
class AdaptersModule {

    @Provides
    internal fun provideHomeAdapter(homeList: MutableList<String>) = HomeAdapter(homeList)

    @Provides
    internal fun provideHomeList() = mutableListOf<String>()

}