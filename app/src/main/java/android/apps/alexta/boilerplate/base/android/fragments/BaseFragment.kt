package android.apps.alexta.boilerplate.base.android.fragments

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.findNavController
import dagger.android.support.DaggerFragment

inline fun <reified T : Fragment> newFragmentInstance(): Fragment = T::class.java.newInstance()

abstract class BaseFragment<T : BaseViewModel<*>> : DaggerFragment() {

    val parentActivity: FragmentActivity by lazy { this.activity!! }
    val lifecycleOwner: LifecycleOwner by lazy { this }

    private val navController by lazy { view?.findNavController() }

    abstract val viewModel: T

    @LayoutRes
    internal abstract fun getLayoutId(): Int

    internal abstract fun initViews()

    internal abstract fun initDataObservers()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val attachToRoot = false
        return inflater.inflate(getLayoutId(), container, attachToRoot)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initDataObservers()
    }

    fun findFragmentById(@IdRes id: Int) = childFragmentManager.findFragmentById(id)

    fun navigateTo(@IdRes destination: Int) {
        navController?.navigate(destination)
    }

}