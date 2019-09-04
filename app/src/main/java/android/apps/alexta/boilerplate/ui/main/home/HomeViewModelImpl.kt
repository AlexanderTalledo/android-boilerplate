package android.apps.alexta.boilerplate.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class HomeViewModelImpl : HomeViewModel() {

    override val tag = HomeViewModelImpl::class.simpleName

    override val viewState: LiveData<HomeUiModel>
        get() = mViewState

    private val mViewState = MutableLiveData<HomeUiModel>()

}