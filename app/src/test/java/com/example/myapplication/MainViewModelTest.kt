package com.example.myapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun loadData_populatesItems() {
        // Observe to trigger LiveData
        viewModel.items.observeForever {}

        // Assert
        val items = viewModel.items.value
        assertNotNull("Items should not be null", items)
        assertEquals("Items size should be 20", 20, items?.size)
    }
}
