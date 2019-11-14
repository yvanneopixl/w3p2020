package com.neopixl.exercice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value1 = 2
        var value2 = 3.0
        var value3 = 0

        for (i in 0..19) {
            println("Valeur 1 : $value1")
            println("Valeur 2 : $value2")
            println("Valeur 3 : $value3")

            value1 += i
            value2 += i * 1.5
            value3 += i * 2
        }

        println("Valeur 1 finale : $value1")
        println("Valeur 2 finale : $value2")
        println("Valeur 3 finale : $value3")
    }
}
