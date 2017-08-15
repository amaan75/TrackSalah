package com.example.amaan.tracksalah.calendar

import android.os.Bundle
import com.example.amaan.tracksalah.R
import com.example.amaan.tracksalah.nav.BaseActivity
import kotlinx.android.synthetic.main.activity_navigation_drawer.*

class HijriCalendarActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //create a reference to the fragment
        val tempFrag = HijriDateFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        // add the list view  fragment to frame layout
        fragmentTransaction.add(R.id.content_frame, tempFrag, tempFrag.TAG).commit()

    }

    override fun onResume() {
        super.onResume()
        //highlighting the calendar activity manually when it starts
        nav_view.menu.findItem(R.id.nav_base_activity_hijri_calendar).isChecked = true
    }

    /**
     * overriding back pressed method to handle the back press for fragments
     */
    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0)
            supportFragmentManager.popBackStack()
        else
            super.onBackPressed()
    }
}
