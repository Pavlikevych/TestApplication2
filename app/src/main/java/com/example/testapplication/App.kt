package com.example.testapplication

import android.app.Application
import com.example.testapplication.di.initInjections

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initInjections(this)
    }
}