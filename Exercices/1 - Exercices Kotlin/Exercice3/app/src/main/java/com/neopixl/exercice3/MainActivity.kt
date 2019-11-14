package com.neopixl.exercice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val values1 = arrayOf(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
        val values2 = arrayOf(2, 4, 8, 16, 32, 64, 128, 256, 512, 1024)

        // Question 2

        var index = 0
        while (index < values1.size && index < values2.size) {
            val firstValue = values1[index]
            val secondValue = values2[index]

            val result = firstValue + secondValue
            println("$firstValue + $secondValue = $result")
            index++
        }

        // Question 3

        for (i in values1.indices) {

            val firstValue = values1[i]

            for (j in values2.indices) {
                val secondValue = values2[j]

                val result = firstValue * secondValue
                println("$firstValue * $secondValue = $result")
            }
        }

        // Question 3

        for (index in values1.indices) {
            val firstValue = values2[values2.size - index - 1]
            val secondValue = values1[index]

            val result = firstValue - secondValue
            println("$firstValue - $secondValue = $result")
        }
    }
}
