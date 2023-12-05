package com.example.savestraysdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class ReportStrayForm : AppCompatActivity() {
    private lateinit var formBackBtn:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_stray_form)
        formBackBtn = findViewById(R.id.formBackBtn)
        formBackBtn.setOnClickListener {
            onBackPressed()
        }



        val reportFormConfirmBtn = findViewById<ImageButton>(R.id.ReportFormConfirmBtn)
        reportFormConfirmBtn.setOnClickListener{
            val intent = Intent(this,ReportStrayConfirmation::class.java)
            startActivity(intent)
        }
    }
}