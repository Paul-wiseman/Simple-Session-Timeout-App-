package com.example.sessiontimeoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.title = "Home Scree"
    }
}