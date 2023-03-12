package com.example.selfscafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val video = findViewById<CardView>(R.id.card_view_1)
        val blog = findViewById<CardView>(R.id.card_view_2)
        val webr = findViewById<CardView>(R.id.card_view_3)
        val myblog = findViewById<CardView>(R.id.card_view_4)

        video.setOnClickListener {
            Toast.makeText(applicationContext,"Opening Videos",Toast.LENGTH_SHORT).show()

            intent = Intent(applicationContext,videos::class.java)
            startActivity(intent)
        }
    }
}