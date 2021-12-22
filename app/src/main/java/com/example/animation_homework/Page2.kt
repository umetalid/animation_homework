package com.example.animation_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        //body
        val page2 = findViewById<Button>(R.id.button2)

        page2.setOnClickListener {
            startActivity(Intent(this, page3::class.java))
            finish()
        }
        //body
    }
}