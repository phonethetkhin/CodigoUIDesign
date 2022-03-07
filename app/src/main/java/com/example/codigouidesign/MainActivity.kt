package com.example.codigouidesign

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    lateinit var btnByRoom: MaterialButton
    lateinit var btnByRates: MaterialButton
    lateinit var cslByRoom: ConstraintLayout
    lateinit var cslByRates: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnByRoom = findViewById(R.id.btnByRoom)
        btnByRates = findViewById(R.id.btnByRates)
        cslByRoom = findViewById(R.id.cslByRoom)
        cslByRates = findViewById(R.id.cslByRates)

        btnByRoom.setOnClickListener {
            btnByRoom.backgroundTintList = resources.getColorStateList(R.color.hintBg)
            btnByRates.backgroundTintList = resources.getColorStateList(R.color.white)

            cslByRoom.visibility = View.VISIBLE
            cslByRates.visibility = View.GONE
        }
        btnByRates.setOnClickListener {
            btnByRoom.backgroundTintList = resources.getColorStateList(R.color.white)
            btnByRates.backgroundTintList = resources.getColorStateList(R.color.hintBg)

            cslByRoom.visibility = View.GONE
            cslByRates.visibility = View.VISIBLE
        }
    }
}