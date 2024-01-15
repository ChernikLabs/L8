package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  butonR = findViewById<Button>(R.id.button)
        var  butonY = findViewById<Button>(R.id.button2)
        var  butonG = findViewById<Button>(R.id.button3)
        var  TextView1 = findViewById<TextView>(R.id.TextV)
        var lay = findViewById<ConstraintLayout>(R.id.Lay)

        butonR.setOnClickListener {
            lay.setBackgroundColor(Color.RED)
            TextView1.text = "Красный"
        }

        butonY.setOnClickListener {
            lay.setBackgroundColor(Color.YELLOW)
            TextView1.text = "Жёлтый"
        }

        butonG.setOnClickListener {
            lay.setBackgroundColor(Color.GREEN)
            TextView1.text = "Зелёный"
        }
    }
}