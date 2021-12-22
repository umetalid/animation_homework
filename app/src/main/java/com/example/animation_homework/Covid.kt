package com.example.animation_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Covid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid)
        //body
        val page2 = findViewById<Button>(R.id.button2)

        page2.setOnClickListener {
            startActivity(Intent(this, page3::class.java))
            finish()
        }
        //body
    }
}