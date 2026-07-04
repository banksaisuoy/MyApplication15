package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemMockDataBinding

class MockDataAdapter : ListAdapter<MockData, MockDataAdapter.MockDataViewHolder>(MockDataDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MockDataViewHolder {
        val binding = ItemMockDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MockDataViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MockDataViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    class MockDataViewHolder(private val binding: ItemMockDataBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(mockData: MockData) {
            binding.itemTitle.text = mockData.title
            binding.itemDescription.text = mockData.description
            Glide.with(binding.itemImage.context)
                .load(mockData.imageUrl)
                .centerCrop()
                .into(binding.itemImage)
        }
    }
}

class MockDataDiffCallback : DiffUtil.ItemCallback<MockData>() {
    override fun areItemsTheSame(oldItem: MockData, newItem: MockData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MockData, newItem: MockData): Boolean {
        return oldItem == newItem
    }
}