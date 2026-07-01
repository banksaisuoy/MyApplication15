package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var feedAdapter: FeedAdapter
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var recyclerView: RecyclerView
    private lateinit var collapsingToolbar: CollapsingToolbarLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout)
        recyclerView = findViewById(R.id.recyclerView)
        collapsingToolbar = findViewById(R.id.collapsingToolbar)

        collapsingToolbar.title = "Explore"

        setupRecyclerView()
        setupSwipeRefresh()

        // Initial load
        loadData()
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        feedAdapter = FeedAdapter(mutableListOf())
        recyclerView.adapter = feedAdapter
    }

    private fun setupSwipeRefresh() {
        swipeRefreshLayout.setOnRefreshListener {
            loadData()
        }
    }

    private fun loadData() {
        // Simulate network delay
        lifecycleScope.launch {
            swipeRefreshLayout.isRefreshing = true
            delay(1500) // 1.5 seconds delay
            val mockData = MockDataHelper.generateMockData()
            feedAdapter.updateData(mockData)
            swipeRefreshLayout.isRefreshing = false
        }
    }
}
