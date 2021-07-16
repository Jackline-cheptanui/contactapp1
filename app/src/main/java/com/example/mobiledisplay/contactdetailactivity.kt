package com.example.mobiledisplay

import android.content.Context
import android.content.Intent
import android.icu.number.NumberFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class contactdetailactivity : AppCompatActivity() {
    lateinit var rvDisplay: RecyclerView
    lateinit var tvname:TextView
    lateinit var tvEmail: TextView
    lateinit var tvphoneNumber:TextView
    lateinit var ivimage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactdetailactivity)
        var intent=intent
        var name=intent.getStringExtra("NAME")
//        var tvname = findViewById<TextView>(R.id.tvName)
//        var tvphoneNumber = findViewById<TextView>(R.id.tvPhoneNumber)
//        var tvEmail = findViewById<TextView>(R.id.tvEmail)
//        var ivimage=findViewById<ImageView>(R.id.ivimage)
//        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()



        var nameintent = intent.getStringExtra("name")
        var emailintent = intent.getStringExtra("Email")
        var phoneintent = intent.getStringExtra("phoneNumber")
        var imageIntent=intent.getStringExtra("image").toString()

        var tvname = findViewById<TextView>(R.id.tvName)
        var tvphoneNumber = findViewById<TextView>(R.id.tvPhoneNumber)
        var tvEmail = findViewById<TextView>(R.id.tvEmail)
        var ivimage=findViewById<ImageView>(R.id.ivimage)
        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()

//        Picasso.get()
//            .load(imageIntent)
//            .into(ivimage)


        tvname.text = nameintent
        tvphoneNumber.text = phoneintent
        tvEmail.text = emailintent
        Picasso.get()
            .load(imageIntent)
            .into(ivimage)


//        var Back = findViewById<Button>(R.id.btnback)
//        var btbback = Back.setOnClickListener {
//            intent= Intent(context,startActivity(intent))


        }

    }

