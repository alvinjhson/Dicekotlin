package com.example.dice

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random
import android.text.InputType;
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceTextView: TextView
    lateinit var nameEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceTextView = findViewById(R.id.textView)
        //nameEditText = findViewById(R.id.editTextText)
        //nameEditText.setInputType(InputType.TYPE_CLASS_NUMBER);

        var button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val name = getnameFromEditText()
            val lastValue = name.toString()
            rollDice(name)
            setText(lastValue)
            Log.d("!!!","Dice value${getnameFromEditText()}")
            Log.d("!!!","textvalue$lastValue")

        }
    }
    fun randomDiceNumber() : Int {
        val random = Random()
        val randomNum = random.nextInt(6) + 1
        return randomNum
    }
    fun getnameFromEditText() : Int {
        //val name = nameEditText.text.toString()
        //val naem = name.toInt()
        val random = Random()
        //val randomInput = random.nextInt(naem) + 1
        val randomInput = random.nextInt(6) + 1
        return randomInput

    }
    fun rollDice(dices: Int){
        val diceImage: ImageView = findViewById(R.id.imageView)
        when (dices) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }

    fun setText(name :String){
        diceTextView.text = "Dice Value $name"
    }




}