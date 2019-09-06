package android.apps.alexta.boilerplate.base.android.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<T : Any, V : BaseViewHolder<T>>(
    private val list: MutableList<T>
) : RecyclerView.Adapter<V>() {

    @LayoutRes
    internal abstract fun getItemLayoutId(): Int

    internal abstract fun getViewHolder(itemView: View): V

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): V {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val attachToRoot = false
        val itemView = inflater.inflate(getItemLayoutId(), parent, attachToRoot)
        return getViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: V, position: Int) {
        holder.bind(list[position], position)
    }

    override fun getItemCount() = list.size

    internal fun addItems(newItems: List<T>) {
        list.addAll(newItems)
    }

}