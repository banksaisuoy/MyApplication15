package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemDashboardBinding

class DashboardAdapter : ListAdapter<Feature, DashboardAdapter.FeatureViewHolder>(FeatureDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeatureViewHolder {
        val binding = ItemDashboardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FeatureViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FeatureViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class FeatureViewHolder(private val binding: ItemDashboardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(feature: Feature) {
            binding.titleTextView.text = feature.title
            binding.descriptionTextView.text = feature.description
            Glide.with(binding.root.context)
                .load(feature.iconUrl)
                .circleCrop()
                .placeholder(R.mipmap.ic_launcher)
                .into(binding.iconImageView)
        }
    }

    class FeatureDiffCallback : DiffUtil.ItemCallback<Feature>() {
        override fun areItemsTheSame(oldItem: Feature, newItem: Feature): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Feature, newItem: Feature): Boolean {
            return oldItem == newItem
        }
    }
}
