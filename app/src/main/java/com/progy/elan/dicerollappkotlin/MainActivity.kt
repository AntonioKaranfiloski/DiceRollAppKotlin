package com.progy.elan.dicerollappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val btnRoll: Button = findViewById(R.id.btnButton)
        btnRoll.setOnClickListener {
            RollDice()
        }
    }

    private fun RollDice() {
        val textView: TextView = findViewById(R.id.txtView)

        val randomInt = Random.nextInt(6) + 1

        textView.text = randomInt.toString()
    }
}
