package com.example.myapplication

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("EXTRA_ITEM", Item::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra("EXTRA_ITEM")
        }

        if (item != null) {
            setupViews(item)
        } else {
            finish()
        }
    }

    private fun setupViews(item: Item) {
        binding.toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        binding.collapsingToolbar.title = item.title

        binding.detailTitle.text = item.title
        binding.detailDescription.text = item.description

        Glide.with(this)
            .load(item.imageUrl)
            .placeholder(R.drawable.circular_placeholder)
            .into(binding.detailImage)
    }
}
