package com.neopixl.exercice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        buttonInvert.setOnClickListener {
            val textFrom = textViewDeparture.text

            textViewDeparture.text = textViewArrival.text
            textViewArrival.text = textFrom
        }
    }

}
