package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import android.widget.TextView

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34])
class ExampleUnitTest {

    @Test
    fun mainActivity_isCreatedAndDisplaysHello() {
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val activity = controller.get()
        assertNotNull(activity)

        val textView = activity.findViewById<TextView>(R.id.textView)
        assertNotNull(textView)
        assertEquals("Hello World!", textView.text.toString())
    }
}
