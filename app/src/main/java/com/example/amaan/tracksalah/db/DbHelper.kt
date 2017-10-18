package com.example.amaan.tracksalah.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.jetbrains.anko.db.*

/**
 * Created by amaan on 9/5/17.
 */

class DbHelper(context: Context) :
        ManagedSQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {


    companion object {
        val DATABASE_VERSION = 1
        val DATABASE_NAME = "salah.db"
    }


    override fun onCreate(db: SQLiteDatabase) {
        db.createTable(SalahTableContract.NAME, true,
                SalahTableContract.ID to INTEGER + PRIMARY_KEY + AUTOINCREMENT,
                SalahTableContract.NAMAZDATE to TEXT,
                SalahTableContract.IMSAK to TEXT,
                SalahTableContract.FAJR to TEXT,
                SalahTableContract.SUNRISE to TEXT,
                SalahTableContract.DHUHR to TEXT,
                SalahTableContract.ASR to TEXT,
                SalahTableContract.MAGHRIB to TEXT,
                SalahTableContract.SUNSET to TEXT,
                SalahTableContract.ISHA to TEXT,
                SalahTableContract.MIDNIGHT to TEXT,
                SalahTableContract.UNIXTIMESTAMP to TEXT)
    }


    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.dropTable(SalahTableContract.NAME, true)
        onCreate(db)
    }

}