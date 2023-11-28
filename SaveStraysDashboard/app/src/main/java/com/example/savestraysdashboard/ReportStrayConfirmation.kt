package com.example.savestraysdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ReportStrayConfirmation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_stray_confirmation)

        val reportConfirmContinueBtn = findViewById<Button>(R.id.ReportConfirmContinueBtn)
        reportConfirmContinueBtn.setOnClickListener{
            val intent = Intent(this,StrayReporting::class.java)
            startActivity(intent)
        }
    }
}