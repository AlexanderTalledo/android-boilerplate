package android.apps.alexta.boilerplate.ui.main.home

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.adapters.HomeAdapter
import android.apps.alexta.boilerplate.base.android.fragments.BaseFragment
import android.apps.alexta.boilerplate.base.android.lifecycle.BaseViewModelFactory
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment<HomeViewModel>() {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    @Inject
    lateinit var homeAdapter: HomeAdapter

    override val viewModel by lazy {
        ViewModelProviders.of(parentActivity, viewModelFactory).get(HomeViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.fragment_home

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.loadHomeList()
    }

    override fun initViews() {
        initHomeRecyclerView()
    }

    private fun initHomeRecyclerView() {
        val layoutManager = LinearLayoutManager(parentActivity)
        val itemDecoration = DividerItemDecoration(
            parentActivity,
            DividerItemDecoration.VERTICAL
        )
        rvHome.layoutManager = layoutManager
        rvHome.addItemDecoration(itemDecoration)
        rvHome.adapter = homeAdapter
    }

    override fun initDataObservers() {
        viewModel.viewState.observe(lifecycleOwner, Observer { uiModel ->
            when (uiModel) {
                is HomeUiModel.OnHomeList -> updateHomeRecyclerViewContent(uiModel.homeList)
            }
        })
    }

    private fun updateHomeRecyclerViewContent(homeList: List<String>) {
        val currentItemsCount = homeAdapter.itemCount
        val newItemsCount = homeList.size
        homeAdapter.addItems(homeList)
        homeAdapter.notifyItemRangeInserted(currentItemsCount, newItemsCount)
    }

}