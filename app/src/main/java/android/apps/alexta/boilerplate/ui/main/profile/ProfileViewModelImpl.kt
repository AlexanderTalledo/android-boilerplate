package android.apps.alexta.boilerplate.ui.main.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ProfileViewModelImpl : ProfileViewModel() {

    override val tag = ProfileViewModelImpl::class.simpleName

    override val viewState: LiveData<ProfileUiModel>
        get() = mViewState

    private val mViewState = MutableLiveData<ProfileUiModel>()

}