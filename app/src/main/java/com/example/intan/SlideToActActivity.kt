package com.example.intan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ncorti.slidetoact.SlideToActView

class SlideToActActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide_to_act)

        val slideToActView = findViewById<SlideToActView>(R.id.example)
        slideToActView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                Log.d("bagas", "slide1: " + view.text + ", id: " + view.id)

                val _intent = Intent(
                    this@SlideToActActivity, LoginActivity::class.java
                )
                startActivity(_intent)
            }

        }
    }
}