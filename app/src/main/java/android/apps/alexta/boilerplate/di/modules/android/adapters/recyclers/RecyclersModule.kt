package android.apps.alexta.boilerplate.di.modules.android.adapters.recyclers

import dagger.Module
import dagger.Provides

@Module
class RecyclersModule {

    @Provides
    internal fun provideRecyclerHomeList() = mutableListOf<String>()

}