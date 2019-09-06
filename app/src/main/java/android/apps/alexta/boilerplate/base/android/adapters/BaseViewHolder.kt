package android.apps.alexta.boilerplate.base.android.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T : Any>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    internal abstract fun bindData(data: T)

    internal abstract fun bindItemClickListener(
        onItemClick: ((itemView: View, itemPosition: Int) -> Unit)?,
        position: Int
    )

}