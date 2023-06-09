package com.example.mvvmkotlin.ui

import android.content.IntentFilter
import android.os.Bundle
import com.example.mvvmkotlin.MyBroadcastReceiver
import com.example.mvvmkotlin.base.BaseActivity
import com.example.mvvmkotlin.databinding.ActivityMainBinding
import me.hgj.mvvmhelper.base.BaseViewModel


class MainActivity : BaseActivity<BaseViewModel, ActivityMainBinding>() {

    override fun initView(savedInstanceState: Bundle?) {
        val receiver = MyBroadcastReceiver()
        val intentFilter = IntentFilter("com.example.MY_ACTION")
        registerReceiver(receiver, intentFilter)

    }
}
