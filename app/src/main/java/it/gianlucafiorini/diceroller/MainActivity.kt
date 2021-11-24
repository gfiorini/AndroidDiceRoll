package it.gianlucafiorini.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        val view : TextView = findViewById(R.id.roll_text)
        val diceValue = Random().nextInt(6) + 1
        view.text = diceValue.toString()
    }
}