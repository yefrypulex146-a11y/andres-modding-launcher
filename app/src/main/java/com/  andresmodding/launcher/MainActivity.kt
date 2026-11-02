package com.andresmodding.launcher

import android.app.Activity
import android.os.Bundle
import android.view.WindowInsets

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            window.insetsController?.hide(WindowInsets.Type.systemBars())
        }
    }
}
