package com.example.week5assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val loginButton:Button = findViewById(R.id.loginbutton)
        loginButton.setOnClickListener {
            val intent = Intent(this, Login_Page::class.java)
            startActivity(intent)
        }


    }

}