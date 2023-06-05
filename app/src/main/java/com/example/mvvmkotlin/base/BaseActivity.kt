package com.example.mvvmkotlin.base

import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.example.mvvmkotlin.R
import com.example.mvvmkotlin.view.CustomToolBar
import com.gyf.immersionbar.ImmersionBar
import me.hgj.mvvmhelper.base.BaseVBActivity
import me.hgj.mvvmhelper.base.BaseViewModel

abstract class BaseActivity<VM : BaseViewModel, VB : ViewBinding> : BaseVBActivity<VM, VB>() {

    var toolbar: CustomToolBar? = null

    override fun getTitleBarView(): View? {
        toolbar = findViewById(R.id.custtom_tool_bar)
        return LayoutInflater.from(this).inflate(R.layout.base_activity_layout, null)
    }

    override fun initImmersionBar() {
        ImmersionBar.with(this).titleBar(toolbar).init()
    }
}
