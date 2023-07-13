package com.example.adapters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList:ArrayList<Users>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name = arrayOf("Nachiket Ekare" , "Asmita" , "Baba" , "Aai" , "Bhauji")

        val lastMsg = arrayOf("Hey! I am Good" , "Cool" , "GoodMorning" ,"How are You" , "Awesome")

        val lastMsgTime = arrayOf("7:45 AM","9:00 PM","8:45 AM" , "8:00 PM" , "11:45 AM")

        val phoneNumber = arrayOf("8605622584" , "9623776147" , "9623210586" , "9623776143" ,"9654632210")

        val imageID = intArrayOf(R.drawable.pic0 , R.drawable.pic1 , R.drawable.pic2 , R.drawable.pic3,
        R.drawable.pic4)

        userArrayList = ArrayList()

        for (eachIndex in name.indices){
            val user = Users(name[eachIndex],lastMsg[eachIndex],lastMsgTime[eachIndex],phoneNumber[eachIndex],
            imageID[eachIndex])

            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.Listview)

        listView.adapter = MyAdapter( this , userArrayList)

        listView.setOnItemClickListener { parent, view, position, id ->

            val userName = name[position]
            val phonenumber = phoneNumber[position]
            val ImgId = imageID[position]

            val intent = Intent(this , UserActivity::class.java)

            intent.putExtra("name" ,userName )
            intent.putExtra("Phone" , phonenumber)
            intent.putExtra("Image" , ImgId)
            startActivity(intent)
        }
    }
}