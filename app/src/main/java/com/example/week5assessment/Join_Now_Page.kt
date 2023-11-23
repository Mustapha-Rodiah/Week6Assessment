package com.example.week5assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JoinNowPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_now_page)
val joinButton: Button = findViewById(R.id.joinButton)
        joinButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        }
    }
}