package android.apps.alexta.boilerplate.di.components

import android.apps.alexta.boilerplate.BoilerplateApplication
import android.apps.alexta.boilerplate.di.modules.ApplicationModule
import android.apps.alexta.boilerplate.di.modules.android.activities.ActivityBindingModule
import android.apps.alexta.boilerplate.di.modules.android.fragments.FragmentBindingModule
import android.apps.alexta.boilerplate.di.modules.repositories.RepositoriesModule
import android.apps.alexta.boilerplate.di.scopes.ApplicationScoped
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication

@ApplicationScoped
@Component(
    modules = [
        ApplicationModule::class,
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class,
        FragmentBindingModule::class,
        RepositoriesModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: BoilerplateApplication)

    override fun inject(instance: DaggerApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: BoilerplateApplication): Builder

        fun build(): ApplicationComponent
    }

}