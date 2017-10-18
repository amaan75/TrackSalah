package com.example.amaan.tracksalah.calendar

import android.os.Bundle
import android.support.v4.app.ListFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.amaan.tracksalah.R

/**
 * Created by Amaan on 15-08-2017.
 */
class HijriDateFragment : ListFragment() {

    val TAG = HijriDateFragment::class.java.simpleName + " ListFragment"

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.layout_hijri_date_fragment, container, false)
        val tempVals1: List<String> = listOf("AMAAN", "AMAAN KA BHAI", "USKI BAHEN", "USKE BETE")
        val tempVals = arrayListOf<String>()
        val tempList = ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, tempVals)
        //val listView = rootView.findViewById<ListView>(android.R.id.list)
        listAdapter = tempList
        return rootView
    }
}