package android.apps.alexta.boilerplate.ui.main

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.fragments.BaseFragment
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

class MainFragment : BaseFragment<MainViewModel>() {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    override val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(parentActivity, viewModelFactory).get(MainViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.fragment_main

    override fun initViews() {}

    override fun initDataObservers() {
        viewModel.viewState.observe(lifecycleOwner, Observer { uiModel ->
            when (uiModel) {

            }
        })
    }

}