package com.example.selfscafe

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView

class KunalV : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal_v)
        val dsa = findViewById<CardView>(R.id.dsakunal)
        val devops = findViewById<CardView>(R.id.devokunal)
        val context: Context = this

        dsa.setOnClickListener {
            val ino = Intent(context,kunalDAS::class.java)
            startActivity(ino)
        }
        devops.setOnClickListener {
            val inn = Intent(context,kunalDEV::class.java)
            startActivity(inn)
        }
    }

}