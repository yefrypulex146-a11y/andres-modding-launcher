package com.andresmodding.launcher

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.WindowInsets
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<android.view.View>(R.id.btnWaze).setOnClickListener {
            abrirApp("com.waze")
        }
        findViewById<android.view.View>(R.id.btnMaps).setOnClickListener {
            abrirApp("com.google.android.apps.maps")
        }
        findViewById<android.view.View>(R.id.btnSpotify).setOnClickListener {
            abrirApp("com.spotify.music")
        }
    }

    private fun abrirApp(paquete: String) {
        val intent: Intent? = packageManager.getLaunchIntentForPackage(paquete)
        if (intent != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "App no instalada", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            window.insetsController?.hide(WindowInsets.Type.systemBars())
        }
    }
}
