package com.example.selfscafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class videos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        val fre=findViewById<CardView>(R.id.freecc)
        val kun=findViewById<CardView>(R.id.kunalc)
        val sua=findViewById<CardView>(R.id.saumyac)
        val harry=findViewById<CardView>(R.id.harry)

        fre.setOnClickListener{
            val itt=Intent(this,freecamp::class.java)
            startActivity(itt)
        }
        kun.setOnClickListener{
            val itt=Intent(this,KunalV::class.java)
            startActivity(itt)
        }
        sua.setOnClickListener{
            val ett=Intent(this,saumyaV::class.java)
            startActivity(ett)
        }
        harry.setOnClickListener{
            val tt=Intent(this,HarryV::class.java)
            startActivity(tt)
        }
    }
}