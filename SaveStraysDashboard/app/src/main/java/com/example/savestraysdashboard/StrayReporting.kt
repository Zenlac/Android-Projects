package com.example.savestraysdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class StrayReporting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stray_reporting)

        val viewReportsbtn = findViewById<ImageView>(R.id.ViewReportsImgView)
        viewReportsbtn.setOnClickListener{
            val intent = Intent(this,ViewReports::class.java)
            startActivity(intent)
        }

        val strayReportbtn = findViewById<ImageView>(R.id.StrayReportImgView)
        strayReportbtn.setOnClickListener{
            val intent = Intent(this,ReportStray::class.java)
            startActivity(intent)
        }
    }
}