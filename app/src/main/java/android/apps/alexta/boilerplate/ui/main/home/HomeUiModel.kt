package android.apps.alexta.boilerplate.ui.main.home

sealed class HomeUiModel {

     data class OnHomeList(val homeList: List<String>) : HomeUiModel()

     data class OnHomeDetail(val homeItemPosition: Int) : HomeUiModel()

}