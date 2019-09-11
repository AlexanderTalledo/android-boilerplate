package android.apps.alexta.boilerplate.ui.main

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModel
import androidx.annotation.IdRes

abstract class MainViewModel : BaseViewModel<MainUiModel>() {

    internal abstract fun loadInitialScreen()

    internal abstract fun loadScreenById(@IdRes screenId: Int)

}