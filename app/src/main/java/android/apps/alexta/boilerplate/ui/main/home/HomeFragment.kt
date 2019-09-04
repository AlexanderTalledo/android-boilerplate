package android.apps.alexta.boilerplate.ui.main.home

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.fragments.BaseFragment
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

class HomeFragment : BaseFragment<HomeViewModel>() {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    override val viewModel by lazy {
        ViewModelProviders.of(parentActivity, viewModelFactory).get(HomeViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.fragment_home

    override fun initViews() {

    }

    override fun initDataObservers() {

    }
}