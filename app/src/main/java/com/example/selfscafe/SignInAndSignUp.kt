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

class SignInAndSignUp : AppCompatActivity() {
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_and_sign_up)

        val signup=findViewById<Button>(R.id.enter)
        val ename=findViewById<TextInputEditText>(R.id.name)
        val eid=findViewById<TextInputEditText>(R.id.idd)
        val emaal = findViewById<TextInputEditText>(R.id.email)
        val ep=findViewById<TextInputEditText>(R.id.passwd)
        val sin=findViewById<TextView>(R.id.SignIn)


        signup.setOnClickListener {

            val name = ename.text.toString()
            val email=emaal.text.toString()
            val unid=eid.text.toString()
            val upass=ep.text.toString()
            val user = User(name,email,unid,upass)
            database = FirebaseDatabase.getInstance().getReference("Users")
            database.child(unid).setValue(user).addOnSuccessListener {
                Toast.makeText(this,"Successfully Registered",Toast.LENGTH_SHORT).show()
                val d=Intent(this,MainActivity::class.java)
                startActivity(d)
                finish()
            }.addOnFailureListener {
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
            }

            ename.setText("")
            emaal.setText("")
            ep.setText("")
            eid.setText("")

        }
        sin.setOnClickListener{
            intent = Intent(this,signin::class.java)
            startActivity(intent)
        }
    }
}