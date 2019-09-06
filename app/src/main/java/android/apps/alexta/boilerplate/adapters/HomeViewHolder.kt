package android.apps.alexta.boilerplate.adapters

import android.apps.alexta.boilerplate.R
import android.apps.alexta.boilerplate.base.android.adapters.BaseViewHolder
import android.view.View
import android.widget.TextView

class HomeViewHolder(itemView: View) : BaseViewHolder<String>(itemView) {

    private val tvName by lazy { itemView.findViewById<TextView?>(R.id.tvName) }

    override fun bind(data: String, position: Int) {
        bindName(data)
    }

    private fun bindName(name: String) {
        tvName?.text = name
    }

}