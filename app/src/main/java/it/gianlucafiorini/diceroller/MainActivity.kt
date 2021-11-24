package it.gianlucafiorini.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.roll_button);
        rollbutton.text = "Let's go!!"
        rollbutton.setOnClickListener {
            doRoll()
        }
    }

    private fun doRoll() {
        val diceImage: ImageView = findViewById(R.id.dice_view)
        val diceValue = Random().nextInt(6) + 1
        val drawableResource = when (diceValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}