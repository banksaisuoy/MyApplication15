package com.example.myapplication

import java.util.UUID

data class ItemModel(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String,
    val imageUrl: String
) {
    companion object {
        fun createMock(): ItemModel {
            return ItemModel(
                title = "Mock Title ${System.currentTimeMillis()}",
                description = "Mock description for the item.",
                imageUrl = "https://picsum.photos/200/300?random=${System.currentTimeMillis()}"
            )
        }

        fun createMocks(count: Int = 10): List<ItemModel> {
            return (1..count).map { createMock() }
        }
    }
}
