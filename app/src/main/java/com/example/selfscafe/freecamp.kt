package com.example.selfscafe

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.annotation.RequiresApi

class freecamp : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_freecamp)
        val wb=findViewById<WebView>(R.id.freewebb)
        webba(wb);
        val butbt=findViewById<Button>(R.id.freebutten)

        butbt.setOnClickListener {
            val ds= Intent(this,videos::class.java)
            startActivity(ds)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webba(wb: WebView?) {
        if(wb != null){
            wb.webViewClient = WebViewClient()
        }

        wb?.apply{
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.youtube.com/@freecodecamp")
        }
    }
}