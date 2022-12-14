package com.example.lessoncalculate2

import android.app.Application
import com.example.lessoncalculate2.remote.LoveApi

class App: Application() {

    companion object{
        lateinit var api: LoveApi
    }

    override fun onCreate() {
        super.onCreate()
    }
}