package com.example.caleb.randomizer2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Button
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn = findViewById<Button>(R.id.rollBtn)
        val output = findViewById<TextView>(R.id.output)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        rollBtn.setOnClickListener{
            val rand = Random().nextInt(seekBar.progress)
            output.text = rand.toString()
        }

    }
}
