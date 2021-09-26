package com.eddy.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // super call
        super.onCreate(savedInstanceState)
        emptyFunction()
        setContentView(R.layout.activity_main)
    }

    private fun emptyFunction() = Unit
}