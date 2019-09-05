package android.apps.alexta.boilerplate.ui.main.home

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModel

abstract class HomeViewModel : BaseViewModel<HomeUiModel>() {

    internal abstract fun loadHomeList()

}