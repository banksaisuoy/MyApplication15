package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: TaskAdapter
    private val tasks = mutableListOf<Task>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Generate auto-mocked data
        for (i in 1..5) {
            tasks.add(Task(i, "Mock Task $i", i % 2 == 0))
        }

        adapter = TaskAdapter(tasks) { task ->
            task.isCompleted = !task.isCompleted
            adapter.notifyDataSetChanged()
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.fab.setOnClickListener {
            val newId = tasks.size + 1
            val newTask = Task(newId, "Mock Task $newId", false)
            adapter.addTask(newTask)
            binding.recyclerView.scrollToPosition(tasks.size - 1)
        }
    }
}
