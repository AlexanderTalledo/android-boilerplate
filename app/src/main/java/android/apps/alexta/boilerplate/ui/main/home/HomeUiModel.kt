package android.apps.alexta.boilerplate.ui.main.home

sealed class HomeUiModel {

     data class OnHomeList(val homeList: List<String>) : HomeUiModel()

}