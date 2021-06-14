package com.android.kotlin.framework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.kotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}