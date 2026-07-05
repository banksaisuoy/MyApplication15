package com.example.myapplication

class ItemRepository {
    fun getItems(): List<Item> {
        return listOf(
            Item("1", "Majestic Mountains", "Explore the breathtaking peaks.", "https://picsum.photos/id/1018/400/300"),
            Item("2", "Serene Lakes", "Find peace by the water.", "https://picsum.photos/id/1015/400/300"),
            Item("3", "Dense Forests", "Wander through the green canopy.", "https://picsum.photos/id/1019/400/300"),
            Item("4", "Sandy Beaches", "Relax under the sun.", "https://picsum.photos/id/1016/400/300"),
            Item("5", "City Lights", "Experience the vibrant nightlife.", "https://picsum.photos/id/1014/400/300")
        )
    }
}
