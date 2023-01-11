package com.example.cart_items

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigationdrawer.R

class CartAdapter(private var items: ArrayList<CartModel>): RecyclerView.Adapter<CartAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product,parent,false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        Glide.with(holder.itemView.context).load(item.productUrl).into(holder.productImage)
    }


    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(row: View) : RecyclerView.ViewHolder(row) {
        var productImage: ImageView
        init {
            this.productImage = row.findViewById(R.id.ivProductImage)
        }
    }
}