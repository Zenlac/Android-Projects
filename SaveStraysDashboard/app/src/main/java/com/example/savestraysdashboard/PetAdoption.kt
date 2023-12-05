package com.example.savestraysdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.savestraysdashboard.databinding.ActivityPetAdoptionBinding

class PetAdoption : AppCompatActivity() {
    private lateinit var petAdoptionBackBtn: ImageButton
    private lateinit var binding : ActivityPetAdoptionBinding
    private lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_adoption)
        petAdoptionBackBtn = findViewById(R.id.petAdoptionBackBtn)
        petAdoptionBackBtn.setOnClickListener {
            onBackPressed()
        }

        binding = ActivityPetAdoptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //image
        val imageId = intArrayOf(

            R.drawable.tofu,R.drawable.mika,R.drawable.ruby,R.drawable.whitie
        )
        //stray names
        val name = arrayOf(
            "Tofu","Mika","Ruby","Whitie"
        )
        //short descriptions
        val shortDescription = arrayOf(
            "White Cat","Orange Cat","Brown Puppy","White Puppy"
        )
        // long descriptions
        val longDescription = arrayOf(
            "Tofu is a white cat that loves \nto play","Mika is a playful cat that \nloves to eat",
            "Ruby is a loyal little puppy","Whitie is a good boy that loves \nto eat!"

        )
        // location info
        val location = arrayOf(
            "Baguio City Veterinary Office","Baguio City Veterinary Office","Baguio City Veterinary Office",
            "Baguio City Veterinary Office"
        )

        userArrayList = ArrayList()

        for(i in name.indices){

            val user = User(name[i],shortDescription[i],longDescription[i],location[i],imageId[i])
            userArrayList.add(user)

        }
        binding.PetAdoptionList.isClickable = true
        binding.PetAdoptionList.adapter = MyAdapter(this, userArrayList)
        binding.PetAdoptionList.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val shortDescription = shortDescription[position]
            val longDescription = longDescription[position]
            val location = location[position]
            val imageId = imageId[position]

            val i = Intent(this, PetAdoptionInfo::class.java)
            i.putExtra("name", name)
            i.putExtra("short description", shortDescription)
            i.putExtra("long description", longDescription)
            i.putExtra("location", location)
            i.putExtra("imageId", imageId)
            startActivity(i)


        }
    }
}