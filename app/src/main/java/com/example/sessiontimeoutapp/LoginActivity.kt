package com.example.sessiontimeoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Login Screen"

        val name = findViewById<TextView>(R.id.editTextTextPersonName)
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            if (name.text.isNotEmpty()){
                startActivity(Intent(this, HomeActivity::class.java))
            }
        }
    }
}