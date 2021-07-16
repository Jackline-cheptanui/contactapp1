package com.example.mobiledisplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class contactapp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactapp)
    }

    var nameintent = intent.getStringExtra("name")
    var emailintent = intent.getStringExtra("Email")
    var phoneintent = intent.getStringExtra("phoneNumber")

    var name = findViewById<TextView>(R.id.tvName)
    var phoneNumber = findViewById<TextView>(R.id.tvPhoneNumber)
    var Email = findViewById<TextView>(R.id.tvEmail)


  }



