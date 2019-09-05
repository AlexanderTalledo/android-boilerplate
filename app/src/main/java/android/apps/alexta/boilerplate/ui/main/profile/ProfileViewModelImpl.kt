package android.apps.alexta.boilerplate.ui.main.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class ProfileViewModelImpl @Inject constructor() : ProfileViewModel() {

    override val tag = ProfileViewModelImpl::class.simpleName

    override val viewState: LiveData<ProfileUiModel>
        get() = mViewState

    private val mViewState = MutableLiveData<ProfileUiModel>()

}