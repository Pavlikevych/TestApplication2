package com.example.testapplication.ui.products

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.R
import com.example.testapplication.local.model.Product
import com.example.testapplication.utils.extensions.loadWithGlide
import kotlinx.android.synthetic.main.item_products_list.view.*
import kotlinx.android.synthetic.main.item_tags_list.view.name

class ProductsAdapter : RecyclerView.Adapter<ProductsAdapter.VH>() {

    private var data = mutableListOf<Product>()

    init {
        setHasStableIds(true)
    }

    override fun getItemId(position: Int): Long {
        return data[position].id ?: 0
    }

    fun setupData(newData: List<Product>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_products_list,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val value = data[position]
        holder.bind(value)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Product) {
            itemView.name.text = item.title
            itemView.available.text = item.variants.size.toString()
            itemView.image.loadWithGlide(item.image.src)
        }
    }
}