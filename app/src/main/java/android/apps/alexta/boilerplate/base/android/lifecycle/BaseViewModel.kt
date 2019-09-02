package android.apps.alexta.boilerplate.base.android.lifecycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<T> : ViewModel() {

    abstract val tag: String?

    abstract val viewState: LiveData<T>

}