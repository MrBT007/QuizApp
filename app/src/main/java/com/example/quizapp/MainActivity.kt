package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.regex.Pattern

class MainActivity : AppCompatActivity()
{
    lateinit var name: EditText
    lateinit var error: TextView
    lateinit var button: Button
    var EXTRA_NAME = "com.example.quizapp.extra.NAME"
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        error = findViewById(R.id.error)
        button = findViewById(R.id.button)

        button.setOnClickListener()
        {
            val namefrom1= name.text.toString()
            if(namefrom1.isEmpty() or !(Pattern.matches("[a-zA-Z]+",namefrom1)))
            {
                error.text = "Please enter valid name"
            }
            else
            {
                val intent = Intent(this,MainActivity2::class.java)
                intent.putExtra(EXTRA_NAME,namefrom1)
                startActivity(intent)
                Toast.makeText(applicationContext,"Answer the question",Toast.LENGTH_SHORT).show()
            }
        }


    }
}