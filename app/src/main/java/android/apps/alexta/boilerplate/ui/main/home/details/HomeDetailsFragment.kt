package android.apps.alexta.boilerplate.ui.main.home.details

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.fragments.BaseFragment
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

class HomeDetailsFragment : BaseFragment<HomeDetailsViewModel>() {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    override val viewModel by lazy {
        ViewModelProviders.of(parentActivity, viewModelFactory)
            .get(HomeDetailsViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.fragment_home_details

    override fun initViews() {}

    override fun initDataObservers() {}
}