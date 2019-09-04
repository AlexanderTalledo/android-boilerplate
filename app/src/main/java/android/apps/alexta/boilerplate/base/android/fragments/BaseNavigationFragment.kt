package android.apps.alexta.boilerplate.base.android.fragments

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModel
import androidx.annotation.IdRes
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

abstract class BaseNavigationFragment<T : BaseViewModel<*>> : BaseFragment<T>() {

    private val navHostFragment by lazy { findFragmentById(getNavHostId()) as NavHostFragment }
    private val navController by lazy { navHostFragment.navController }

    @IdRes
    internal abstract fun getNavHostId(): Int

    fun setBottomNavController(bottomNavigationView: BottomNavigationView) {
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }

}