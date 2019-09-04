package android.apps.alexta.boilerplate.ui.splash

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.fragments.BaseFragment
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

class SplashFragment : BaseFragment<SplashViewModel>() {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    override val viewModel by lazy {
        ViewModelProviders.of(parentActivity, viewModelFactory).get(SplashViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.fragment_splash

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.showInitialScreen()
    }

    override fun initViews() {}

    override fun initDataObservers() {
        viewModel.viewState.observe(lifecycleOwner, Observer { uiModel ->
            when (uiModel) {
                SplashUiModel.OnMainScreen -> showMainScreen()
            }
        })
    }

    private fun showMainScreen() {
        navigateTo(R.id.main_screen)
    }

}