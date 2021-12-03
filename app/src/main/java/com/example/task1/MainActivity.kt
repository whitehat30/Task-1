package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickMeButton = findViewById<TextView>(R.id.clickButton)
        val clickMeButton1 =findViewById<TextView>(R.id.clickButton1)
        val clickMeButton2 =findViewById<TextView>(R.id.clickButton2)
        val clickDisplay =findViewById<TextView>(R.id.clickButton3)

        clickMeButton.setOnClickListener()
        {
            clickDisplay.text = "Roses are red"
        }
        clickMeButton1.setOnClickListener()
        {
            clickDisplay.text = "Green was clicked"
        }
        clickMeButton2.setOnClickListener()
        {
            clickDisplay.text = "Blue was clicked"
        }
    }
}