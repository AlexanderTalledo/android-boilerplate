package android.apps.alexta.boilerplate.ui.main

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.fragments.BaseNavigationFragment
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

class MainFragment : BaseNavigationFragment<MainViewModel>() {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    override val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(parentActivity, viewModelFactory).get(MainViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.fragment_main

    override fun getNavHostId() = R.id.nav_host_fragment_main

    override fun initViews() {
        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        setBottomNavController(bnMain)
    }

    override fun initDataObservers() {
        viewModel.viewState.observe(lifecycleOwner, Observer { uiModel ->
            when (uiModel) {

            }
        })
    }

}