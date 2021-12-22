package com.example.animation_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        //body
        val page1 = findViewById<Button>(R.id.button)

        page1.setOnClickListener {
            startActivity(Intent(this, Page2::class.java))
            finish()
        }
        //body
    }
}