package android.apps.alexta.boilerplate.ui.splash

import javax.inject.Inject

class SplashViewModelImpl @Inject constructor() : SplashViewModel() {

    override val tag = SplashViewModelImpl::class.simpleName

    override fun showInitialScreen() {
        setViewState(SplashUiModel.OnMainScreen)
    }

}