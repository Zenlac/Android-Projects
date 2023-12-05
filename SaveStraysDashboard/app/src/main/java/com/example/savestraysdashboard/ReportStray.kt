package com.example.savestraysdashboard

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class ReportStray : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var btPickImage: Button
    private lateinit var btTakeImage: Button
    private lateinit var ReportStrayBackBtn: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_stray)

        ReportStrayBackBtn = findViewById(R.id.ReportStrayBackBtn)
        ReportStrayBackBtn.setOnClickListener {
            onBackPressed()
        }

        imageView = findViewById(R.id.image_view)
        btPickImage = findViewById(R.id.ImagePickerBtn)
        btTakeImage = findViewById(R.id.ImageTakerBtn)

        btTakeImage.setOnClickListener{
                    takeImage()
        }

        btPickImage.setOnClickListener{
            pickImage()
        }

        val reportConfirmBtn = findViewById<ImageButton>(R.id.ReportStrayConfirmBtn)
        reportConfirmBtn.setOnClickListener{
            val intent = Intent(this,ReportStrayForm::class.java)
            startActivity(intent)
        }
    }

    fun takeImage() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent,1)
    }


    fun pickImage() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent,2)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK) {
            if(requestCode == 2 && data !=null)
                imageView.setImageURI(data?.data)

            }
            if(requestCode == 1 && data !=null) {
                imageView.setImageBitmap(data.extras!!.get("data") as Bitmap)
            }
        }
}


