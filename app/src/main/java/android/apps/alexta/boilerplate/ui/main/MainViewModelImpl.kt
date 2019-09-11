package android.apps.alexta.boilerplate.ui.main

import android.apps.alexta.boilerplate.R
import javax.inject.Inject

class MainViewModelImpl @Inject constructor() : MainViewModel() {

    override val tag = MainViewModelImpl::class.simpleName

    override fun loadScreenById(screenId: Int) {
        when (screenId) {
            R.id.bottom_menu_item_home -> loadScreen(MainUiModel.OnLoadHomeScreen)
            R.id.bottom_menu_item_profile -> loadScreen(MainUiModel.OnLoadProfileScreen)
            else -> loadInitialScreen()
        }
    }

    override fun loadInitialScreen() {
        loadScreen(MainUiModel.OnLoadDefaultScreen)
    }

    private fun loadScreen(screen: MainUiModel) {
        setViewState(screen)
    }

}