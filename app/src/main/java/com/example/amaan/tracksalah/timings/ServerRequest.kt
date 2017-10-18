package com.example.amaan.tracksalah.timings

/**
 * Created by amaan on 10/18/17.
 */
import com.google.gson.Gson
import  java.net.URL

class ServerRequest {

    fun timingsRequest() {
        val URL = "http://api.aladhan.com/calendar?" +
                "latitude=$lat&longitude=$lon&method=$method&month=$month&year=$year"
        val timingResultStr = URL(URL).readText()
        return Gson().fromJson(timingResultStr, )
    }
}