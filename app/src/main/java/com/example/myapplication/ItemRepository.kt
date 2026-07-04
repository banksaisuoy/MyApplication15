package com.example.myapplication

class ItemRepository {
    fun getItems(): List<Item> {
        return listOf(
            Item("1", "Item 1", "Description for Item 1", "https://via.placeholder.com/150"),
            Item("2", "Item 2", "Description for Item 2", "https://via.placeholder.com/150"),
            Item("3", "Item 3", "Description for Item 3", "https://via.placeholder.com/150"),
            Item("4", "Item 4", "Description for Item 4", "https://via.placeholder.com/150"),
            Item("5", "Item 5", "Description for Item 5", "https://via.placeholder.com/150")
        )
    }
}
