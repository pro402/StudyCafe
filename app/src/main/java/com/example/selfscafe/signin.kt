package com.example.selfscafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class signin : AppCompatActivity() {
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val signin = findViewById<Button>(R.id.enter)
        val sup = findViewById<TextView>(R.id.uup)

        database = FirebaseDatabase.getInstance().getReference("Users")

        signin.setOnClickListener {
            val pass = findViewById<TextInputEditText>(R.id.passwd)
            val p = pass.text.toString()
            val user = findViewById<TextInputEditText>(R.id.ide)
            val usd = user.text.toString()

            if (usd.isNotBlank()) {
                database.child(usd).get().addOnSuccessListener { dataSnapshot ->
                    if (dataSnapshot.exists()) {
                        val passwd = dataSnapshot.child("password").value

                        if (passwd.toString() == p) {
                            intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            finish()
                        } else {
                            Toast.makeText(this, "Wrong Password", Toast.LENGTH_LONG).show()
                        }
                    } else {
                        Toast.makeText(this, "Try Sign Up first", Toast.LENGTH_LONG).show()
                    }
                }.addOnFailureListener {
                    Toast.makeText(this, "FAILED TO CONNECT DB", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Please Enter User Unique Id", Toast.LENGTH_SHORT).show()
            }
        }

        sup.setOnClickListener {
            val into = Intent(this, SignInAndSignUp::class.java)
            startActivity(into)
        }
    }
}