package com.example.selfscafe

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val c = findViewById<ImageView>(R.id.img)
        supportActionBar?.hide()

        Handler().postDelayed({
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        },2000)
    }
}