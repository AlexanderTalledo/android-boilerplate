package android.apps.alexta.boilerplate.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class MainViewModelImpl @Inject constructor() : MainViewModel() {

    override val tag: String?
        get() = MainViewModelImpl::class.simpleName

    override val viewState: LiveData<MainUiModel>
        get() = mViewState

    private val mViewState = MutableLiveData<MainUiModel>()

    override fun foo() {
        mViewState.value = MainUiModel.OnFoo
    }

}