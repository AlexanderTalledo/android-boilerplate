package android.apps.alexta.boilerplate.ui.splash

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.fragments.BaseFragment
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

class SplashFragment : BaseFragment<SplashViewModel>() {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    override val viewModel by lazy {
        ViewModelProviders.of(parentActivity, viewModelFactory).get(SplashViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.fragment_splash

    override fun initViews() {

    }

    override fun initDataObservers() {

    }

}