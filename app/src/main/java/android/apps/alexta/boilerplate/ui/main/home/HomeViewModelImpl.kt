package android.apps.alexta.boilerplate.ui.main.home

import android.apps.alexta.boilerplate.repositories.HomeRepository
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class HomeViewModelImpl @Inject constructor(
    private val homeRepository: HomeRepository
) : HomeViewModel() {

    override val tag = HomeViewModelImpl::class.simpleName

    override val viewState: LiveData<HomeUiModel>
        get() = mViewState

    private val mViewState = MutableLiveData<HomeUiModel>()

    override fun loadHomeList() {
        val homeList = homeRepository.getHomeList()
        mViewState.value = HomeUiModel.OnHomeList(homeList)
    }

    override fun loadHomeItem(itemPosition: Int) {
        mViewState.value = HomeUiModel.OnHomeDetail(itemPosition)
    }

}