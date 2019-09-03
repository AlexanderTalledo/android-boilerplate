package android.apps.alexta.boilerplate.ui

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.activities.BaseActivity
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

class SplashActivity : BaseActivity<SplashViewModel>() {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    override val viewModel: SplashViewModel by lazy {
        ViewModelProviders.of(activity, viewModelFactory).get(SplashViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.activity_splash

    override fun initViews() {
        viewModel.foo()
    }

    override fun initDataObservers() {
        viewModel.viewState.observe(lifecycleOwner, Observer { uiModel ->
            when (uiModel) {
                SplashUiModel.OnFoo -> Toast.makeText(activity, "Yes", Toast.LENGTH_LONG).show()
            }
        })
    }

}
