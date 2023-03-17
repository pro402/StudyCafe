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

class kunalDAS : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal_das)
        val kb=findViewById<WebView>(R.id.kunalDAS)
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
            loadUrl("https://www.youtube.com/playlist?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ")
        }
    }
}