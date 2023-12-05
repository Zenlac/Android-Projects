package com.example.savestraysdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ReportStrayForm : AppCompatActivity() {
    private lateinit var FormBackBtn:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_stray_form)
        FormBackBtn = findViewById(R.id.FormBackBtn)
        FormBackBtn.setOnClickListener {
            onBackPressed()
        }

        val reportFormConfirmBtn = findViewById<ImageButton>(R.id.ReportFormConfirmBtn)
        reportFormConfirmBtn.setOnClickListener{
            val intent = Intent(this,ReportStrayConfirmation::class.java)
            startActivity(intent)
        }
    }
}