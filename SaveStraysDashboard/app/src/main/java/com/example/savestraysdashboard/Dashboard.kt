package com.example.savestraysdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val petAdoptionBtn = findViewById<Button>(R.id.PetAdoptionBtn)
        petAdoptionBtn.setOnClickListener(){
            val intent = Intent(this,PetAdoption::class.java)
            startActivity(intent)
        }



    }
}