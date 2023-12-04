package com.example.savestraysdashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PetAdoption : AppCompatActivity() {
    private lateinit var PetAdoptionBackBtn: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_adoption)
        PetAdoptionBackBtn = findViewById(R.id.PetAdoptionBackBtn)
        PetAdoptionBackBtn.setOnClickListener {
            onBackPressed()

        }
    }
}