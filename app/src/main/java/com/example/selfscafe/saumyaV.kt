package com.example.selfscafe

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.annotation.RequiresApi

class saumyaV : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saumya_v)
        val sb=findViewById<WebView>(R.id.saumyawebb)
        sebba(sb);
        val sutbt=findViewById<Button>(R.id.saumyabutten)

        sutbt.setOnClickListener {
            val ss= Intent(this,videos::class.java)
            startActivity(ss)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun sebba(sb: WebView?) {
        if(sb != null){
            sb.webViewClient = WebViewClient()
        }

        sb?.apply{
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.youtube.com/playlist?list=PLTV_nsuD2lf4UCTV6xwvNPvFdmCNKyhc8")
        }
    }
}