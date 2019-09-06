package android.apps.alexta.boilerplate.adapters

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.adapters.BaseRecyclerAdapter
import android.view.View

class HomeAdapter(
    list: MutableList<String> = mutableListOf()
) : BaseRecyclerAdapter<String, HomeViewHolder>(list) {

    override fun getItemLayoutId() = R.layout.item_home

    override fun getViewHolder(itemView: View) = HomeViewHolder(itemView)

}