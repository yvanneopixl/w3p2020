package com.neopixl.exercice4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Character(private val name: String, private var life: Int) {

    fun fight() {
        if(life<=0) return

        life -= 10

        if (life <= 0) {
            println("$name est mort.")
        }
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val players = arrayListOf<Character>()

        players.add(Character("Alan \"Dutch\" Schaefer", 200))
        players.add(Character("Ellen Ripley", 300))
        players.add(Character("John McClane", 150))
        players.add(Character("Nick Fury", 250))
        players.add(Character("Chuck Norris", 500))

        for (index in 0..24) {
            for (player in players) {
                player.fight()
            }
        }
    }
}
