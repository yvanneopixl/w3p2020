package com.neopixl.seekbarcolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

fun SeekBar.setOnProgressListener(listener: (progress: Int) -> Unit) {
    this.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            listener(progress)
        }

        override fun onStartTrackingTouch(seekBar: SeekBar?) {

        }

        override fun onStopTrackingTouch(seekBar: SeekBar?) {

        }
    })
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set default background color to black
        colorFrameLayout.setBackgroundColor(Color.BLACK)

        val progressListener: (Int) -> Unit = {
            val color = Color.argb(255, redSeekBar.progress, greenSeekBar.progress, blueSeekBar.progress)
            colorFrameLayout.setBackgroundColor(color)
        }

        redSeekBar.setOnProgressListener(progressListener)
        greenSeekBar.setOnProgressListener(progressListener)
        blueSeekBar.setOnProgressListener(progressListener)

    }
}
