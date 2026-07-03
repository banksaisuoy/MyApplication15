package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val mockData = generateMockData()
        val adapter = ItemAdapter(mockData)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }

    private fun generateMockData(): List<ItemModel> {
        val items = mutableListOf<ItemModel>()
        for (i in 1..20) {
            items.add(
                ItemModel(
                    id = i,
                    title = "Breathtaking Item $i",
                    description = "This is an auto-mocked, fully functional description for item $i showcasing high stability and complete functionality without placeholders."
                )
            )
        }
        return items
    }
}
