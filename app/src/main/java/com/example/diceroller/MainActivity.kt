package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        val displayText : TextView = findViewById(R.id.display_text)
        val randomNumber = Random.nextInt(6) + 1;
        displayText.text = randomNumber.toString()
    }
}