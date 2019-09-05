package android.apps.alexta.boilerplate.di.modules.repositories

import android.apps.alexta.boilerplate.repositories.HomeRepository
import android.apps.alexta.boilerplate.repositories.HomeRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoriesModule {

    @Binds
    internal abstract fun bindHomeRepository(homeRepositoryImpl: HomeRepositoryImpl): HomeRepository

}