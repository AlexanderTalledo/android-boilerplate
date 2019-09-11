package android.apps.alexta.boilerplate.base.android.fragments

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModel
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

abstract class BaseNavigationFragment<T : BaseViewModel<*>> : BaseFragment<T>() {

    @IdRes
    internal abstract fun getNavHostId(): Int

    internal fun navigateToChild(fragment: Fragment) {
        val fragmentTransaction = childFragmentManager.beginTransaction()
        if (childFragmentManager.fragments.isEmpty()) {
            fragmentTransaction.replace(getNavHostId(), fragment)
        } else {
            val fragmentChildren = childFragmentManager.fragments
            val fragmentChildrenCount = fragmentChildren.size
            fragmentTransaction.hide(fragmentChildren[fragmentChildrenCount.minus(1)])
            fragmentTransaction.add(getNavHostId(), fragment)
            fragmentTransaction.addToBackStack(null)
        }
        fragmentTransaction.commit()
    }

}