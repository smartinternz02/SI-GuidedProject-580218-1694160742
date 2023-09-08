package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    final lateinit var btn: Button
    final lateinit var img:ImageView
    final lateinit var txt:TextView


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.rollbtn)
        img = findViewById(R.id.imagedice)
        txt = findViewById(R.id.text1)

        btn.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice()
    {
        val random = Random()
        val randomnum = random.nextInt(6)+1
        val resultText = "You have rolled a $randomnum!"

        txt.text=resultText
        if(randomnum==1)
        {
            img.setImageResource(R.drawable.one)
        }
        else if(randomnum==2)
        {
            img.setImageResource(R.drawable.two)
        }
        else if(randomnum==3)
        {
            img.setImageResource(R.drawable.three)
        }
        else if(randomnum==4)
        {
            img.setImageResource(R.drawable.four)
        }
        else if(randomnum==5)
        {
            img.setImageResource(R.drawable.five)
        }
        else if(randomnum==6)
        {
            img.setImageResource(R.drawable.six)
        }
    }
}