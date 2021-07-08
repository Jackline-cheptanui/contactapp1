package com.example.mobiledisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvDisplay:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number()


    }
    fun number(){
        var contactList= listOf<contact>(
            contact("sharon","0769209586","cheptanuijacklinee@gmail.com"),
            contact("sheila","07137070486","sheilacheruto@gmail.com"),
            contact("Hamdi","0746382921","hamdiabass@gmail.com"),
            contact("Thomas","0765329253","Thomaschepsiror@gmail.com"),
            contact("Naum","0746372982","naumchepsiror@gmail.com"),
            contact("Barnaba","0746283110","barnabakiptoo@gmail.com"),
            contact("Marie","0763576228","marierotich@gmail.com"),
            contact("Edna","0737482931","ednamukami@gmail.com")



        )
        rvDisplay=findViewById(R.id.rvDisplay)
        var ContactAdapter=contactRecycleView(contactList)
        rvDisplay.layoutManager=LinearLayoutManager(baseContext)
        rvDisplay.adapter=ContactAdapter
    }
}