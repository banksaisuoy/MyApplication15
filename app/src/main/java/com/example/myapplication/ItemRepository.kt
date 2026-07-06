package com.example.myapplication

object ItemRepository {
    fun getItems(): List<Item> {
        return listOf(
            Item(
                id = "1",
                title = "Mountain View",
                description = "A beautiful view of the mountains covered in snow with a clear blue sky.",
                imageUrl = "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?auto=format&fit=crop&q=80&w=800"
            ),
            Item(
                id = "2",
                title = "Ocean Waves",
                description = "Relaxing ocean waves hitting the sandy beach at sunset.",
                imageUrl = "https://images.unsplash.com/photo-1505118380757-91f5f5632de0?auto=format&fit=crop&q=80&w=800"
            ),
            Item(
                id = "3",
                title = "Forest Path",
                description = "A quiet and peaceful path going deep into the green forest.",
                imageUrl = "https://images.unsplash.com/photo-1448375240586-882707db888b?auto=format&fit=crop&q=80&w=800"
            ),
            Item(
                id = "4",
                title = "City Lights",
                description = "The vibrant city comes alive at night with thousands of colorful lights.",
                imageUrl = "https://images.unsplash.com/photo-1519501025264-65ba15a82390?auto=format&fit=crop&q=80&w=800"
            ),
            Item(
                id = "5",
                title = "Desert Dunes",
                description = "Endless sand dunes under the scorching sun in the vast desert.",
                imageUrl = "https://images.unsplash.com/photo-1509316785289-025f5b846b35?auto=format&fit=crop&q=80&w=800"
            )
        )
    }
}
