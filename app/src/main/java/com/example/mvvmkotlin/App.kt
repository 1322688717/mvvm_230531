package com.example.mvvmkotlin

import android.app.Application
import me.hgj.mvvmhelper.base.MvvmHelper

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        MvvmHelper.init(this, BuildConfig.DEBUG)
    }
}
