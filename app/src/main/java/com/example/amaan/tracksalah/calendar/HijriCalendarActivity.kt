package com.example.amaan.tracksalah.calendar

import android.os.Bundle
import android.widget.FrameLayout
import com.example.amaan.tracksalah.R
import com.example.amaan.tracksalah.nav.BaseActivity
import kotlinx.android.synthetic.main.activity_navigation_drawer.*
import org.jetbrains.anko.find

class HijriCalendarActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //create a reference to content frame layout and load the layout file in the frame layout
        val contentFrameLayout = find<FrameLayout>(R.id.content_frame)
        layoutInflater.inflate(R.layout.activity_hijri_calendar, contentFrameLayout)
    }

    override fun onResume() {
        super.onResume()
        //highlighting the calendar activity manually when it starts
        nav_view.menu.findItem(R.id.nav_base_activity_hijri_calendar).isChecked = true
    }
}
