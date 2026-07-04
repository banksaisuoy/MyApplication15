package com.example.myapplication.data

import java.util.UUID

open class ItemRepository {

    open fun getItems(): List<Item> {
        return List(20) { index ->
            Item(
                id = UUID.randomUUID().toString(),
                title = "Item ${index + 1}",
                description = "This is a beautifully auto-mocked description for item number ${index + 1}. It contains some text to show how the layout handles multiple lines.",
                imageUrl = "https://picsum.photos/seed/${index + 1}/200/200"
            )
        }
    }
}
