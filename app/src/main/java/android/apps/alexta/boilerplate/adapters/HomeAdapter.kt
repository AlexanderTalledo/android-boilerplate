package android.apps.alexta.boilerplate.adapters

import android.apps.alexta.boilerplate.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import javax.inject.Inject

class HomeAdapter @Inject constructor(
    val homeList: MutableList<String>
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val attachToRoot = false
        val itemView = inflater.inflate(R.layout.item_home, parent, attachToRoot)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = homeList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val name = homeList[position]
        holder.tvName?.text = name
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView?>(R.id.tvName)
    }

}