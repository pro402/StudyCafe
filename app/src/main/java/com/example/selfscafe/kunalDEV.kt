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

class kunalDEV : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal_dev)
        val kb=findViewById<WebView>(R.id.kunalDEV)
        kebba(kb);
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun kebba(kb: WebView?) {
        if(kb != null){
            kb.webViewClient = WebViewClient()
        }

        kb?.apply{
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.youtube.com/playlist?list=PL9gnSGHSqcnoqBXdMwUTRod4Gi3eac2Ak")
        }
    }
}