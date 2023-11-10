import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.dice.R
import java.util.Random

class Dice {
    lateinit var diceImage: ImageView
    lateinit var diceTextView: TextView
    lateinit var diceScore1: TextView
    lateinit var diceScore2: TextView
    lateinit var diceScore3: TextView
    lateinit var diceScore4: TextView
    lateinit var diceScore5: TextView
    lateinit var diceP2Score1: TextView
    lateinit var diceP2Score2: TextView
    lateinit var diceP2Score3: TextView
    lateinit var diceP2Score4: TextView
    lateinit var diceP2Score5: TextView
    lateinit var button1 : Button
    lateinit var button2 : Button
    lateinit var totalScoreP1 : TextView
    lateinit var totalScoreP2 : TextView
    constructor(
        diceTextView: TextView,
        diceScore1: TextView,
        diceScore2: TextView,
        diceScore3: TextView,
        diceScore4: TextView,
        diceScore5: TextView,
        diceP2Score1: TextView,
        diceP2Score2: TextView,
        diceP2Score3: TextView,
        diceP2Score4: TextView,
        diceP2Score5: TextView,
        button1: Button,
        button2: Button,
        diceImage: ImageView,
        totalScoreP1: TextView,
        totalScoreP2: TextView
    ) {
        this.diceTextView = diceTextView
        this.diceScore1 = diceScore1
        this.diceScore2 = diceScore2
        this.diceScore3 = diceScore3
        this.diceScore4 = diceScore4
        this.diceScore5 = diceScore5
        this.diceP2Score1 = diceP2Score1
        this.diceP2Score2 = diceP2Score2
        this.diceP2Score3 = diceP2Score3
        this.diceP2Score4 = diceP2Score4
        this.diceP2Score5 = diceP2Score5
        this.button1 = button1
        this.button2 = button2
        this.diceImage = diceImage
        this.totalScoreP1 = totalScoreP1
        this.totalScoreP2 = totalScoreP2
    }
    fun rollDice(dices: Int) {
        //val diceImage: ImageView = findViewById(R.id.imageView)
        when (dices) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
    fun getnameFromEditText(): Int {
        //val name = nameEditText.text.toString()
        //val naem = name.toInt()
        val random = Random()
        //val randomInput = random.nextInt(naem) + 1
        val randomInput = random.nextInt(6) + 1
        return randomInput
    }
    fun diceGame() {
        //var button1 = findViewById<Button>(R.id.button1)
        var clickCountP1 = 0
        var clickCountP2 = 0
        var currentPlayer = 1
        button1.setOnClickListener {
            if (currentPlayer == 1){
                val name = getnameFromEditText()
                val lastValue = name.toString()
                rollDice(name)
                setText(lastValue)
                currentPlayer = 2
                when (clickCountP1) {
                    0 -> setScore1(lastValue)
                    1 -> setScore2(lastValue)
                    2 -> setScore3(lastValue)
                    3 -> setScore4(lastValue)
                    4 -> setScore5(lastValue)
                }
                setTotalScoreP1()
                clickCountP1++
            }
            else if (currentPlayer == 2) {
                val name = getnameFromEditText()
                val lastValue = name.toString()
                rollDice(name)
                setText(lastValue)
                currentPlayer = 1
                when (clickCountP2) {
                    0 -> setScore1P2(lastValue)
                    1 -> setScore2P2(lastValue)
                    2 -> setScore3P2(lastValue)
                    3 -> setScore4P2(lastValue)
                    4 -> setScore5P2(lastValue)
                }
                setTotalScoreP2()
                clickCountP2++
            }
        }
    }
    fun setText(name: String) {
        diceTextView.text = "Dice Value $name"
    }
    fun setScore1(score1: String){
        diceScore1.text = score1
    }
    fun setScore2(score2: String){
        diceScore2.text = score2
    }
    fun setScore3(score3: String){
        diceScore3.text = score3
    }
    fun setScore4(score4: String){
        diceScore4.text = score4
    }
    fun setScore5(score5: String){
        diceScore5.text = score5
    }
    fun setScore1P2(score1: String){
        diceP2Score1.text = score1
    }
    fun setScore2P2(score2: String){
        diceP2Score2.text = score2
    }
    fun setScore3P2(score3: String){
        diceP2Score3.text = score3
    }
    fun setScore4P2(score4: String){
        diceP2Score4.text = score4
    }
    fun setScore5P2(score5: String){
        diceP2Score5.text = score5
    }
    fun setTotalScoreP1(){
       val totalScore = addScoresP1()
       totalScoreP1.text="Total Score: $totalScore"
    }
    fun setTotalScoreP2(){
        val totalScore = addScoresP2()
        totalScoreP2.text="Total Score: $totalScore"
    }

    fun addScoresP1(): String {
        return try {
            val score1 = diceScore1.text.toString().toInt()
            val score2 = diceScore2.text.toString().toInt()
            val score3 = diceScore3.text.toString().toInt()
            val score4 = diceScore4.text.toString().toInt()
            val score5 = diceScore5.text.toString().toInt()
            Log.d("!!!","logscore1 value$score1")
            Log.d("!!!", "diceScore1 text value: ${diceScore1.text}")
            val totalScorep1String = ( score1 + score2 + score3+ score4 + score5)
            val totalScoreP1Int = totalScorep1String.toString()
            totalScoreP1Int
        } catch (e: NumberFormatException) {
            // Hantera felet här, kanske returnera 0 eller visa ett felmeddelande
            "0"
        }
    }
    fun addScoresP2(): String {
        return try {
            val score1 = diceP2Score1.text.toString().toInt()
            val score2 = diceP2Score2.text.toString().toInt()
            val score3 = diceP2Score3.text.toString().toInt()
            val score4 = diceP2Score4.text.toString().toInt()
            val score5 = diceP2Score5.text.toString().toInt()
            Log.d("!!!","logscore1 value$score1")
            Log.d("!!!", "diceScore1 text value: ${diceScore1.text}")
            val totalScorep2String = ( score1 + score2 + score3+ score4 + score5)
            val totalScoreP2Int = totalScorep2String.toString()
            totalScoreP2Int
        } catch (e: NumberFormatException) {
            // Hantera felet här, kanske returnera 0 eller visa ett felmeddelande
            "0"
        }
    }
}