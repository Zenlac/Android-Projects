package com.example.savestraysdashboard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import kotlin.collections.Map


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val petAdoptionBtn = findViewById<Button>(R.id.PetAdoptionBtn)
        petAdoptionBtn.setOnClickListener{
            val intent = Intent(this,PetAdoption::class.java)
            startActivity(intent)
        }

        val strayReportingBtn = findViewById<Button>(R.id.StrayReportingBtn)
        strayReportingBtn.setOnClickListener{
            val intent = Intent(this,StrayReporting::class.java)
            startActivity(intent)
        }

        val mapBtn = findViewById<Button>(R.id.MapBtn)
        mapBtn.setOnClickListener{
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        val profileBtn = findViewById<ImageButton>(R.id.ProfileBtn)
        profileBtn.setOnClickListener{
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }











    }



}
