package android.apps.alexta.boilerplate.base.android.lifecycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<T> : ViewModel() {

    abstract val tag: String?

    val viewState: LiveData<T>
        get() = mViewState

    private val mViewState = MutableLiveData<T>()

    internal fun setViewState(value: T) {
        mViewState.value = value
    }

}