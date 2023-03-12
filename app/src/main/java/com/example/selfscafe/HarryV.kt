package com.example.selfscafe

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.annotation.RequiresApi

class HarryV : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harry_v)
        val hb=findViewById<WebView>(R.id.harrwebb)
        hebba(hb);
        val hutbt=findViewById<Button>(R.id.harrbutten)

        hutbt.setOnClickListener {
            val hs= Intent(this,videos::class.java)
            startActivity(hs)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun hebba(hb: WebView?) {
        if(hb != null){
            hb.webViewClient = WebViewClient()
        }

        hb?.apply{
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.youtube.com/@CodeWithHarry")
        }
    }
}