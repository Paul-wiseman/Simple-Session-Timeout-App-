package com.example.sessiontimeoutapp

import android.app.Application
import java.util.*

class MyApp:Application() {

    private var listener: LogoutListener? = null
    private  lateinit var timer:Timer

    fun startUserSession(){
        timer = Timer()
        timer.schedule(object : TimerTask(){
            override fun run() {
                listener?.onSessionLogout()
            }

        }, 5000)
    }

    private fun cancelTimer() {
        timer.cancel()
    }

    fun registerSessionListener(logoutListener: LogoutListener) {
        this.listener = logoutListener
    }

    fun onUserInteracted(){
        timer.cancel()
        timer = Timer()
        timer.schedule(object : TimerTask(){
            override fun run() {
                listener?.onSessionLogout()
            }

        }, 5000)
    }
}