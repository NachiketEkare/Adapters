package com.example.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context:Activity , val arrayList: ArrayList<Users>): ArrayAdapter<Users>(context,
R.layout.eachrow,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.eachrow , null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.Tv1)
        val lastMsg = view.findViewById<TextView>(R.id.Tv2)
        val lastMsgTime = view.findViewById<TextView>(R.id.Tv3)

        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].LastMsg
        lastMsgTime.text = arrayList[position].LastMsgTime
        image.setImageResource(arrayList[position].imageId)


        return view
    }


}