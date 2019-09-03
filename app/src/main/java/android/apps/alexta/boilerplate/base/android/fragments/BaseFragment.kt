package android.apps.alexta.boilerplate.base.android.fragments

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.DaggerFragment

abstract class BaseFragment<T : BaseViewModel<*>> : DaggerFragment() {

    val parentActivity: FragmentActivity by lazy { this.activity!! }
    val lifecycleOwner: LifecycleOwner by lazy { this }

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

}