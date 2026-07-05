package com.example.myapplication

import android.os.Build
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.UPSIDE_DOWN_CAKE])
class MainActivityTest {

    private lateinit var activity: MainActivity

    @Before
    fun setUp() {
        activity = Robolectric.buildActivity(MainActivity::class.java).create().start().resume().get()
    }

    @Test
    fun testRecyclerViewIsPopulated() {
        val recyclerView = activity.findViewById<RecyclerView>(R.id.recyclerView)
        assertNotNull("RecyclerView should not be null", recyclerView)

        val adapter = recyclerView.adapter as ItemAdapter
        assertNotNull("Adapter should not be null", adapter)

        // Give adapter time to process the submitted list asynchronously if needed, or check item count
        assertEquals("Adapter should have 5 items based on mock data", 5, adapter.itemCount)
    }
}
