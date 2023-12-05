package com.example.savestraysdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.savestraysdashboard.databinding.ActivityPetAdoptionBinding
import com.example.savestraysdashboard.databinding.ActivityViewReportsBinding

class ViewReports : AppCompatActivity() {
    private lateinit var straylistBackBtn:ImageButton
    private lateinit var binding: ActivityViewReportsBinding
    private lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_reports)
        straylistBackBtn = findViewById(R.id.straylistBackBtn)
        straylistBackBtn.setOnClickListener {
            onBackPressed()
        }

        binding = ActivityViewReportsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //image
        val imageId = intArrayOf(

            R.drawable.mocha,R.drawable.morgana,R.drawable.pepper,R.drawable.pickles,
            R.drawable.tiger,
        )
        //stray names
        val name = arrayOf(
            "Mocha","Morgana","Pepper","Pickles","Tiger"
        )
        //short descriptions
        val shortDescription = arrayOf(
            "White & Brown Dog","Black & White Cat","White & Brown Cat","White Dog","Garfield?"
        )
        // long descriptions
        val longDescription = arrayOf(
            "Mocha is a White dog with brown \nspots. he likes sleeping on roads","Morgana is a stray cat that loves \nto eat from the garbage",
            "Pepper is a problematic stray, \nshe destroys the plants in our \ngarden","Pickles is a good boy that loves to \neat!",
            "Tiger is an orange cat that keeps \neating my pet birds"

        )
        // location info
        val location = arrayOf(
            "Navy Base, Baguio City","Camp Johnhay, Baguio City","Loakan, Baguio City",
            "Burnham Park, Baguio City","Burnham Park, Baguio City"
        )

        userArrayList = ArrayList()

        for(i in name.indices){

            val user = User(name[i],shortDescription[i],longDescription[i],location[i],imageId[i])
            userArrayList.add(user)

        }
        binding.ViewReportList.isClickable = true
        binding.ViewReportList.adapter = MyAdapter(this, userArrayList)
        binding.ViewReportList.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val shortDescription = shortDescription[position]
            val longDescription = longDescription[position]
            val location = location[position]
            val imageId = imageId[position]

            val i = Intent(this, ViewReportsInfo::class.java)
            i.putExtra("name", name)
            i.putExtra("short description", shortDescription)
            i.putExtra("long description", longDescription)
            i.putExtra("location", location)
            i.putExtra("imageId", imageId)
            startActivity(i)


        }
    }
}