package com.example.dice

import Dice
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceTextView = findViewById<TextView>(R.id.textView)
        val diceScore1 = findViewById<TextView>(R.id.p1_score1)
        val diceScore2 = findViewById<TextView>(R.id.p1_score2)
        val diceScore3 = findViewById<TextView>(R.id.p1_score3)
        val diceScore4 = findViewById<TextView>(R.id.p1_score4)
        val diceScore5 = findViewById<TextView>(R.id.p1_score5)
        val diceP2Score1 = findViewById<TextView>(R.id.p2_score1)
        val diceP2Score2 = findViewById<TextView>(R.id.p2_score2)
        val diceP2Score3 = findViewById<TextView>(R.id.p2_score3)
        val diceP2Score4 = findViewById<TextView>(R.id.p2_score4)
        val diceP2Score5 = findViewById<TextView>(R.id.p2_score5)
        var button2 = findViewById<Button>(R.id.button2)
        var button1 = findViewById<Button>(R.id.button1)
        val totalScoreP1 = findViewById<TextView>(R.id.p1_totalScore)
        val totalScoreP2 = findViewById<TextView>(R.id.p2_totalScore)
        diceScore1.text = ""
        diceScore2.text = ""
        diceScore3.text = ""
        diceScore4.text = ""
        diceScore5.text = ""
        diceP2Score1.text = ""
        diceP2Score2.text = ""
        diceP2Score3.text = ""
        diceP2Score4.text = ""
        diceP2Score5.text = ""


        val diceClass = Dice(diceTextView,diceScore1,diceScore2,diceScore3,diceScore4,diceScore5,diceP2Score1,diceP2Score2,diceP2Score3,diceP2Score4,diceP2Score5,button1,button2,diceImage,totalScoreP1,totalScoreP2)
        button2.setOnClickListener {
            diceClass.diceGame()
        }
    }




}



