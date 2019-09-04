package android.apps.alexta.boilerplate.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class SplashViewModelImpl : SplashViewModel() {

    override val tag = SplashViewModelImpl::class.simpleName

    override val viewState: LiveData<SplashUiModel>
        get() = mViewState

    private val mViewState = MutableLiveData<SplashUiModel>()

    override fun showInitialScreen() {
        mViewState.value = SplashUiModel.OnMainScreen
    }

}