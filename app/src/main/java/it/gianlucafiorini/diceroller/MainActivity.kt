package it.gianlucafiorini.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.roll_button);
        rollbutton.text = "Let's go!!"
        rollbutton.setOnClickListener {
            val t : Toast = Toast.makeText(this, "Urrà!", Toast.LENGTH_SHORT)
            t.show()
        }
        

    }
}