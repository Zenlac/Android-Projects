package com.example.savestraysdashboard

import android.app.Activity
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private  val context : Activity,private val arrayList : ArrayList<User>) : ArrayAdapter<User>(context,
    R.layout.list_item,arrayList)       {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup):View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView : ImageView = view.findViewById(R.id.strayPic)
        val stname : TextView = view.findViewById(R.id.strayName)
        val shortdesc : TextView = view.findViewById(R.id.shortDesc)

        imageView.setImageResource(arrayList[position].imageId)
        stname.text = arrayList[position].name
        shortdesc.text = arrayList[position].shortDescription


        return view
    }
}