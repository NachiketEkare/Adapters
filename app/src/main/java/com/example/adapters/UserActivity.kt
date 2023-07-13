package com.example.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)


        val name = intent.getStringExtra("name")
        val phoneNo = intent.getStringExtra("Phone")
        val imageID = intent.getIntExtra("Image",R.drawable.pic0)

        val Image = findViewById<CircleImageView>(R.id.profile_image)
        val newName = findViewById<TextView>(R.id.TV1)
        val newPhone = findViewById<TextView>(R.id.TV2)

        newName.text = name
        newPhone.text = phoneNo
        Image.setImageResource(imageID)
    }
}