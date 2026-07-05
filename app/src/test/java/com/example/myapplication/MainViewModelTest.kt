package com.example.myapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `viewModel initialization loads mock data`() {
        val viewModel = MainViewModel()

        viewModel.features.observeForever { }
        val features = viewModel.features.value

        assertNotNull(features)
        assertEquals(5, features?.size)
        assertEquals("Advanced Analytics", features?.get(0)?.title)
    }
}
