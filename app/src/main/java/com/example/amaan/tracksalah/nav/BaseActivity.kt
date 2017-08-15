package com.example.amaan.tracksalah.nav

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.amaan.tracksalah.R
import com.example.amaan.tracksalah.calendar.HijriCalendarActivity
import com.example.amaan.tracksalah.timings.TodayTimings
import kotlinx.android.synthetic.main.activity_navigation_drawer.*
import kotlinx.android.synthetic.main.layout_toolbar.*
import org.jetbrains.anko.startActivity

open class BaseActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    open var prevSelectionId: Int = R.id.nav_base_activity_today_timings
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        //Remember this is the FrameLayout area within your activity_main.xml
//        val contentFrameLayout = find<FrameLayout>(R.id.content_frame)
        //      layoutInflater.inflate(R.layout.activity_today_timings, contentFrameLayout)

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onResume() {
        super.onResume()
        nav_view.setCheckedItem(R.id.nav_base_activity_dummy_none)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.navigation_drawer, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val navId = item.itemId
        when (navId) {
            R.id.nav_base_activity_today_timings -> {
                // check the previous selection and if not same activity then start the activity
                //if (prevSelectionId != R.id.nav_base_activity_today_timings) {
                    startActivity<TodayTimings>()
                //}
            }
            R.id.nav_base_activity_hijri_calendar -> {
                // check the previous selection and if not same activity then start the activity
                //        if (prevSelectionId != R.id.nav_base_activity_hijri_calendar) {
                    startActivity<HijriCalendarActivity>()
                //      }
            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}
