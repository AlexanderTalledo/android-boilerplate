package android.apps.alexta.boilerplate.base.android.activities

import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModel
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.lifecycle.LifecycleOwner
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity<T: BaseViewModel<*>> : DaggerAppCompatActivity() {

    val activity: DaggerAppCompatActivity by lazy { this }
    val lifecycleOwner: LifecycleOwner by lazy { this }

    abstract val viewModel: T

    @LayoutRes
    internal abstract fun getLayoutId(): Int

    internal abstract fun initViews()

    internal abstract fun initDataObservers()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initViews()
        initDataObservers()
    }

}