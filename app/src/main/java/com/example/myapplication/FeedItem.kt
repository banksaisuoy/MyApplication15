package com.example.myapplication

data class FeedItem(
    val id: String,
    val title: String,
    val description: String,
    val category: String,
    val imageUrl: String = "" // Placeholder for future usage, but simulated currently via drawable
)
