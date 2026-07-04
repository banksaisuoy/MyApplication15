package com.example.myapplication

import android.os.Build
import android.widget.TextView
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class MainActivityTest {

    @Test
    fun `test activity creation and UI elements`() {
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val activity = controller.get()

        assertNotNull(activity)

        val textView = activity.findViewById<TextView>(R.id.textView)
        assertNotNull("TextView should not be null", textView)
        assertEquals("Text should match the string resource", activity.getString(R.string.hello_world), textView.text.toString())
    }
}
