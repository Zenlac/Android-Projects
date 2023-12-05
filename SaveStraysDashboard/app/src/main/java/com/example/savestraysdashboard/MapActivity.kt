package com.example.savestraysdashboard
import com.google.android.gms.maps.SupportMapFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapActivity : AppCompatActivity(),OnMapReadyCallback {
    private lateinit var mapBackBtn: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        mapBackBtn = findViewById(R.id.mapBackBtn)
        mapBackBtn.setOnClickListener {
            onBackPressed()
        }

        // Get the SupportMapFragment and request notification when the map is ready to be used.
        val mapFragment = supportFragmentManager.findFragmentById(R.id.mapFragment) as? SupportMapFragment
        mapFragment?.getMapAsync(this)




    }

    override fun onMapReady(googleMap: GoogleMap) {
        val sydney = LatLng(12.8797, 121.7740)
        googleMap.addMarker(
            MarkerOptions()
                .position(sydney)
                .title("Marker in Philippines")
        )
    }
}