package com.example.sessiontimeoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.view.ContentInfoCompat

open class BaseActivity : AppCompatActivity(), LogoutListener {
    //    private lateinit var mTextView:TextView
    private lateinit var myApp: MyApp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
       myApp = MyApp()

        myApp.registerSessionListener(this)

        myApp.startUserSession()

//        mTextView = findViewById(R.id.)


    }

    override fun onUserInteraction() {
        super.onUserInteraction()

        Log.d("onUserInteraction", "onUserInteraction: is called--- ")
        myApp.onUserInteracted()
    }

    override fun onSessionLogout() {
        finish()
       val intent = Intent(this, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK and Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(intent)
    }
}