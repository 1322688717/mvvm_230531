package com.example.mvvmkotlin.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mvvmkotlin.R

class CustomToolBar : ConstraintLayout {

    private var toolBar: androidx.appcompat.widget.Toolbar? = null
    private var tv_title: TextView? = null

    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr,
    ) {
        initView(context)
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        initView(context)
    }

    @SuppressLint("ResourceAsColor")
    fun initView(context: Context) {
        var view = LayoutInflater.from(context).inflate(R.layout.custom_tool_bar, this)
        tv_title = view.findViewById(R.id.tv_title)
        toolBar = view.findViewById(R.id.toolbar)
        tv_title?.let {
            it.setTextColor(R.color.teal_700)
            it.text = "标题"
        }
        toolBar?.setBackgroundColor(R.color.blue)
    }

    fun setTitleText(str: String) {
        Log.e("tag", str)
        tv_title?.text = str
    }
}
