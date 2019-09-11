package android.apps.alexta.boilerplate.ui.main

sealed class MainUiModel {

    object OnLoadDefaultScreen : MainUiModel()

    object OnLoadHomeScreen : MainUiModel()

    object OnLoadProfileScreen : MainUiModel()

}