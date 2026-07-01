package com.example.myapplication

import java.util.UUID

object MockDataHelper {

    private val titles = listOf(
        "Exploring the Future of Android Development",
        "10 Ways to Improve Your Kotlin Code",
        "Mastering Jetpack Compose: A Comprehensive Guide",
        "The Rise of AI in Mobile Applications",
        "Designing Breathtaking User Interfaces",
        "Optimizing App Performance for Low-End Devices",
        "A Deep Dive into Coroutines and Flows",
        "Building Scalable Architectures with MVVM",
        "Understanding Dependency Injection in Android",
        "Navigating the Complexities of App Store Optimization"
    )

    private val descriptions = listOf(
        "Discover the latest trends and best practices in building robust, performant, and beautiful Android applications using Kotlin and Jetpack Compose.",
        "Learn simple yet effective techniques to write cleaner, more maintainable, and idiomatic Kotlin code.",
        "A complete walkthrough of Jetpack Compose, Android's modern toolkit for building native UI. From basic layouts to advanced animations.",
        "Explore how Artificial Intelligence and Machine Learning are transforming the way we interact with mobile apps.",
        "Principles and practical tips for creating visually stunning and highly intuitive user experiences.",
        "Strategies to ensure your app runs smoothly across all devices, regardless of hardware limitations.",
        "Mastering asynchronous programming in Kotlin using Coroutines and Flows for responsive applications.",
        "A practical guide to implementing Model-View-ViewModel architecture to build scalable and testable apps.",
        "Demystifying Dependency Injection and exploring popular frameworks like Dagger and Hilt.",
        "Strategies to increase your app's visibility and downloads in the competitive Google Play Store."
    )

    private val categories = listOf(
        "TECHNOLOGY",
        "KOTLIN",
        "UI/UX",
        "PERFORMANCE",
        "ARCHITECTURE",
        "AI",
        "BUSINESS"
    )

    fun generateMockData(count: Int = 20): List<FeedItem> {
        val data = mutableListOf<FeedItem>()
        for (i in 0 until count) {
            data.add(
                FeedItem(
                    id = UUID.randomUUID().toString(),
                    title = titles.random(),
                    description = descriptions.random(),
                    category = categories.random()
                )
            )
        }
        return data
    }
}
