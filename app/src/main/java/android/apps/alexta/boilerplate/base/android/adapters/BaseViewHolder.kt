package android.apps.alexta.boilerplate.base.android.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T : Any>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    internal abstract fun bind(data: T, position: Int)

}