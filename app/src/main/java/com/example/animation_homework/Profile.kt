package com.example.animation_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        //body
        val page1 = findViewById<Button>(R.id.button)

        page1.setOnClickListener {
            startActivity(Intent(this, Covid::class.java))
            finish()
        }
        //body
    }
}