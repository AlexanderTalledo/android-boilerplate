package android.apps.alexta.boilerplate.di.modules

import android.apps.alexta.boilerplate.BoilerplateApplication
import android.apps.alexta.boilerplate.di.qualifiers.ApplicationContext
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
abstract class ApplicationModule {

    @Binds
    @ApplicationContext
    internal abstract fun bindApplicationContext(application: BoilerplateApplication): Context

}