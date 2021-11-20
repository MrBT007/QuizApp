package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity()
{
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        textView = findViewById(R.id.textView2)
        val finalName = intent.getStringExtra("Name")
        val score = intent.getIntExtra("Score",0)
        textView.setText("Congratulations $finalName"+" your Score is $score")
    }
}