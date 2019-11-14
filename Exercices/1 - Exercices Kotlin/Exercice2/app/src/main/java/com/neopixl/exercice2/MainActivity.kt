package com.neopixl.exercice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var maxNumber = 0
        var minNumber = 40

        val tabInt = List(10) { Random.nextInt(maxNumber, minNumber)}

        println("Toutes les valeurs : $tabInt")

        for(value in tabInt) {
            if (value > maxNumber) {
                maxNumber = value
            }

            if (value < minNumber) {
                minNumber = value
            }
        }

        val sortedTabInt = tabInt.sorted()

        println("Valeur la plus petite : $minNumber")
        println("Valeur la plus petite : ${sortedTabInt[0]}")

        println("Valeur la plus grande : $maxNumber")
        println("Valeur la plus grande : ${sortedTabInt.last()}")

    }
}
