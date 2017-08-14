package com.example.amaan.tracksalah.calendar

import android.os.Bundle
import android.widget.FrameLayout
import com.example.amaan.tracksalah.R
import com.example.amaan.tracksalah.nav.BaseActivity
import org.jetbrains.anko.find

class HijriCalendarActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //create a reference to content frame layout and load the layout file in the frame layout
        val contentFrameLayout = find<FrameLayout>(R.id.content_frame)
        layoutInflater.inflate(R.layout.activity_hijri_calendar, contentFrameLayout)
    }
}
