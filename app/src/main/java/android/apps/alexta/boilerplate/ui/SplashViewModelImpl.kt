package android.apps.alexta.boilerplate.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class SplashViewModelImpl @Inject constructor() : SplashViewModel() {

    override val tag: String?
        get() = SplashViewModelImpl::class.simpleName

    override val viewState: LiveData<SplashUiModel>
        get() = mViewState

    private val mViewState = MutableLiveData<SplashUiModel>()

    override fun foo() {
        mViewState.value = SplashUiModel.OnFoo
    }

}