package com.example.savestraysdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView

class ReportStray : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var btPickImage: Button
    private lateinit var btTakeImage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_stray)
        imageView = findViewById(R.id.image_view)
        btPickImage = findViewById(R.id.ImagePickerBtn)

        btPickImage.setOnClickListener{
            pickImage()
        }
    }
    fun pickImage() {
        val intent = Intent(MediaStore.ACTION_PICK_IMAGES)
        startActivityForResult(intent,101)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}