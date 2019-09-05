package android.apps.alexta.boilerplate.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class MainViewModelImpl @Inject constructor() : MainViewModel() {

    override val tag = MainViewModelImpl::class.simpleName

    override val viewState: LiveData<MainUiModel>
        get() = mViewState

    private val mViewState = MutableLiveData<MainUiModel>()

}