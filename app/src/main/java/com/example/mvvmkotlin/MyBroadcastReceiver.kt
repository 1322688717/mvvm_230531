package com.example.mvvmkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.mvvmkotlin.ui.MainActivity


class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // 处理接收到的广播事件
        if (intent.action == "com.example.MY_ACTION") {
            // 启动目标 Activity
            val targetIntent = Intent(context, MainActivity::class.java)
            targetIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(targetIntent)
        }
    }
}
