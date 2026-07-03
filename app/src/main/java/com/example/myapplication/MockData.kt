package com.example.myapplication

data class MockItem(
    val id: Int,
    val title: String,
    val description: String,
    val colorResId: Int
)

object MockData {
    fun getMockItems(): List<MockItem> {
        return (1..20).map { index ->
            MockItem(
                id = index,
                title = "Beautiful Item $index",
                description = "This is a highly detailed and wonderfully auto-generated description for item number $index. It provides full context and complete functionality.",
                colorResId = android.R.color.holo_blue_light // Using a standard Android color resource
            )
        }
    }
}
