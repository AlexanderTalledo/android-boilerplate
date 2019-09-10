package android.apps.alexta.boilerplate.ui.main.home

import android.apps.alexta.boilerplate.repositories.HomeRepository
import javax.inject.Inject

class HomeViewModelImpl @Inject constructor(
    private val homeRepository: HomeRepository
) : HomeViewModel() {

    override val tag = HomeViewModelImpl::class.simpleName

    override fun loadHomeList() {
        val homeList = homeRepository.getHomeList()
        setViewState(HomeUiModel.OnHomeList(homeList))
    }

    override fun loadHomeItem(itemPosition: Int) {
        setViewState(HomeUiModel.OnHomeDetail(itemPosition))
    }

}