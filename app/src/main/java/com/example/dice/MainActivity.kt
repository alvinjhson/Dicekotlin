package com.example.dice

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random
import android.text.InputType;

class MainActivity : AppCompatActivity() {
    lateinit var diceTextView: TextView
    lateinit var nameEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceTextView = findViewById(R.id.textView)
        nameEditText = findViewById(R.id.editTextText)
        nameEditText.setInputType(InputType.TYPE_CLASS_NUMBER);

        var button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val name = getnameFromEditText()
            val lastValue = name.toString()
            setText(lastValue)
        }
    }
    fun randomDiceNumber() : Int {
        val random = Random()
        val randomNum = random.nextInt(6) + 1
        return randomNum
    }
    fun getnameFromEditText() : Int {
        val name = nameEditText.text.toString()
        val naem = name.toInt()
        val random = Random()
        val randomInput = random.nextInt(naem) + 1
        return randomInput
    }
    fun setText(name :String){
        diceTextView.text = "Dice Value $name"
    }




}