package com.example.aidlserver

import android.app.Service
import android.content.Intent
import android.graphics.Color
import android.os.IBinder

class AidlService : Service() {

    override fun onBind(intent: Intent): IBinder {
        return binder
    }

    val binder: IAidlColorInterface.Stub = object : IAidlColorInterface.Stub() {
        override fun getColor(): Int {
            //get random color
            val r = (Math.random() * 255).toInt()
            val g = (Math.random() * 255).toInt()
            val b = (Math.random() * 255).toInt()
            val color = Color.rgb(r, g, b)
            return color
        }
    }
}