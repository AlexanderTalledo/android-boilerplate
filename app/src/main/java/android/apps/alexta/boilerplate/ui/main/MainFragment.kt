package android.apps.alexta.boilerplate.ui.main

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.fragments.BaseNavigationFragment
import android.apps.alexta.boilerplate.base.android.fragments.newFragmentInstance
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import android.apps.alexta.boilerplate.ui.main.home.HomeFragment
import android.apps.alexta.boilerplate.ui.main.profile.ProfileFragment
import android.os.Bundle
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.loadInitialScreen()
    }

    override fun initViews() {
        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        bnMain.setOnNavigationItemSelectedListener {
            viewModel.loadScreenById(it.itemId)
            true
        }
    }

    override fun initDataObservers() {
        viewModel.viewState.observe(lifecycleOwner, Observer { uiModel ->
            when (uiModel) {
                is MainUiModel.OnLoadDefaultScreen -> showDefaultScreen()
                is MainUiModel.OnLoadHomeScreen -> showHomeScreen()
                is MainUiModel.OnLoadProfileScreen -> showProfileScreen()
            }
        })
    }

    private fun showDefaultScreen() {
        showHomeScreen()
    }

    private fun showHomeScreen() {
        navigateToChild(newFragmentInstance<HomeFragment>())
    }

    private fun showProfileScreen() {
        navigateToChild(newFragmentInstance<ProfileFragment>())
    }

}