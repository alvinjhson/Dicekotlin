package com.example.dice

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.Random
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var diceTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //diceTextView = findViewById(R.id.textView) // Hitta din TextView här
        //val diceValue = randomDiceNumber() // Generera ett tärningsvärde
        //val diceValueString = diceValue.toString() // Konvertera int till String
        //diceTextView.text = diceValueString // Sätt strängen som text i TextView
        //Log.d("!!!", "Dicenumber:$diceValue"  )
        var button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            diceTextView = findViewById(R.id.textView) // Hitta din TextView här
            val diceValue = randomDiceNumber() // Generera ett tärningsvärde
            val diceValueString = diceValue.toString() // Konvertera int till String
            diceTextView.text = diceValueString // Sätt strängen som text i TextView
        }
    }
    fun randomDiceNumber() : Int {
        val random = Random()
        val randomNum = random.nextInt(6) + 1
        return randomNum
    }



}