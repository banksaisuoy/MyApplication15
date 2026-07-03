package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemCardBinding
import com.google.android.material.snackbar.Snackbar

class ItemAdapter(private val items: List<ItemModel>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.binding.itemTitle.text = item.title
        holder.binding.itemDescription.text = item.description

        holder.itemView.setOnClickListener { view ->
            Snackbar.make(view, "Clicked on ${item.title}", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = items.size
}
