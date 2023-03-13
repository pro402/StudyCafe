package com.example.selfscafe

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignInAndSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_and_sign_up)

        val nametxt = findViewById<TextInputEditText>(R.id.name)
        val mailtxt = findViewById<TextInputEditText>(R.id.email)
        val passwdtxt = findViewById<TextInputEditText>(R.id.passwd)
        val enter = findViewById<Button>(R.id.enter)


        val context: Context = this

        enter.setOnClickListener {
            val name = nametxt.text.toString()
            val email= mailtxt.text.toString()
            val password = passwdtxt.text.toString()

            if (name == "admin" && email == "admin.admin" && password == "admin123") {
                val intent = Intent(context, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else if (name.isBlank() || email.isBlank() || password.isBlank()) {
                Toast.makeText(context, "Error: All fields are required.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Error: Invalid credentials.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}