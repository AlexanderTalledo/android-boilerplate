package android.apps.alexta.boilerplate.ui.main.profile

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.fragments.BaseFragment
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject

class ProfileFragment : BaseFragment<ProfileViewModel>() {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    override val viewModel by lazy {
        ViewModelProviders.of(parentActivity, viewModelFactory).get(ProfileViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.fragment_profile

    override fun initViews() {

    }

    override fun initDataObservers() {

    }
}