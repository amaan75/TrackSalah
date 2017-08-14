package com.example.amaan.tracksalah.timings

import android.os.Bundle
import android.widget.FrameLayout
import com.example.amaan.tracksalah.R
import com.example.amaan.tracksalah.nav.BaseActivity
import kotlinx.android.synthetic.main.activity_navigation_drawer.*
import org.jetbrains.anko.find


class TodayTimings : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Remember this is the FrameLayout area within your activity_main.xml
        val contentFrameLayout = find<FrameLayout>(R.id.content_frame)
        layoutInflater.inflate(R.layout.activity_today_timings, contentFrameLayout)
    }

    override fun onResume() {
        super.onResume()
        //highlighting the item that is currently selected
        nav_view.menu.findItem(R.id.nav_base_activity_today_timings).isChecked = true
    }
}

