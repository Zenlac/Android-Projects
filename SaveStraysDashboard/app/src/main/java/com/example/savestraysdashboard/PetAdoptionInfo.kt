package com.example.savestraysdashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.savestraysdashboard.databinding.ActivityPetAdoptionInfoBinding

class PetAdoptionInfo : AppCompatActivity() {
    private lateinit var PetAdoptionInfoBackBtn: ImageButton
    private lateinit var binding : ActivityPetAdoptionInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_adoption_info)
        PetAdoptionInfoBackBtn = findViewById(R.id.PetAdoptionInfoBackBtn)
        PetAdoptionInfoBackBtn.setOnClickListener {
            onBackPressed()
        }
        binding = ActivityPetAdoptionInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val longDescription = intent.getStringExtra("long description")
        val location = intent.getStringExtra("location")
        val imageId = intent.getIntExtra("imageId",R.drawable.tofu)

        binding.CatNameTxt.text = name
        binding.DetailsTxt.text = longDescription
        binding.LocationTxt.text = location
        binding.StrayImg.setImageResource(imageId)
    }
}