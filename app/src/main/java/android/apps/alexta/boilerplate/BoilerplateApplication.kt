package android.apps.alexta.boilerplate

import android.apps.alexta.boilerplate.di.components.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BoilerplateApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val boilerplateApplication = this
        val applicationComponent = DaggerApplicationComponent.builder()
            .application(boilerplateApplication)
            .build()
        applicationComponent.inject(boilerplateApplication)
        return applicationComponent
    }

}