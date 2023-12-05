package com.example.savestraysdashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.savestraysdashboard.databinding.ActivityViewReportsInfoBinding

class ViewReportsInfo : AppCompatActivity() {
    private lateinit var ViewReportInfoBackBtn: ImageButton
    private lateinit var binding : ActivityViewReportsInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_reports_info)
        ViewReportInfoBackBtn = findViewById(R.id.ViewReportInfoBackBtn)
        ViewReportInfoBackBtn.setOnClickListener {
            onBackPressed()
        }
        binding = ActivityViewReportsInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val longDescription = intent.getStringExtra("long description")
        val location = intent.getStringExtra("location")
        val imageId = intent.getIntExtra("imageId",R.drawable.mocha)

        binding.StrayNameTxt.text = name
        binding.DetailsTxt.text = longDescription
        binding.LocationTxt.text = location
        binding.ViewReportImg.setImageResource(imageId)
    }
}