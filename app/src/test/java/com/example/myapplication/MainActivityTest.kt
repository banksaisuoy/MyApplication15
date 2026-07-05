package com.example.myapplication

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import androidx.recyclerview.widget.RecyclerView
import android.view.View

@RunWith(AndroidJUnit4::class)
@Config(sdk = [32]) // Target an SDK supported by Robolectric 4.12.1 initially
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun activityLaunches_recyclerViewHasItems() {
        activityRule.scenario.onActivity { activity ->
            // Check that the RecyclerView exists
            val recyclerView = activity.findViewById<RecyclerView>(R.id.recycler_view)
            assertNotNull("RecyclerView should be found", recyclerView)

            // Check that the adapter has items (mock data is loaded immediately)
            val adapter = recyclerView.adapter
            assertNotNull("Adapter should be attached", adapter)

            // Allow time/looper for LiveData to post to main thread and submit to adapter
            org.robolectric.shadows.ShadowLooper.idleMainLooper()

            assertEquals("Adapter should have 20 items loaded", 20, adapter?.itemCount)
        }
    }
}
