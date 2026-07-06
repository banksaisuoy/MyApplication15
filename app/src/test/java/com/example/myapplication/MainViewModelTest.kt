package com.example.myapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(manifest = Config.NONE)
class MainViewModelTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun loadMockData_updatesLiveData() {
        // Arrange
        val viewModel = MainViewModel()

        // Act
        viewModel.loadMockData()

        // Assert
        assertEquals("Hello MVVM!", viewModel.mockData.value)
    }
}
