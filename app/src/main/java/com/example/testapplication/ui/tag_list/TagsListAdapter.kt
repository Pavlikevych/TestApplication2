package com.example.testapplication.ui.tag_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.R
import com.example.testapplication.local.model.ProductType
import com.example.testapplication.utils.extensions.toLongOrNull
import kotlinx.android.synthetic.main.item_tags_list.view.*

class TagsListAdapter(
    val listener: OnProductTypeClickListener
) : RecyclerView.Adapter<TagsListAdapter.VH>() {

    private var data = mutableListOf<ProductType>()

    init {
        setHasStableIds(true)
    }

    override fun getItemId(position: Int): Long {
        return data[position].id.toLongOrNull() ?: 0
    }

    fun setupData(newData: List<ProductType>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_tags_list,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val value = data[position]
        holder.bind(value)
        holder.itemView.setOnClickListener {
            listener.onProductTypeClick(value.productType)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: ProductType) {
            itemView.name.text = item.productType
        }
    }
}