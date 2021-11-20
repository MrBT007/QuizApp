package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity()
{
    lateinit var answered: TextView
    lateinit var score: TextView
    lateinit var question: TextView
    lateinit var yes: Button
    lateinit var no: Button
    val questions = arrayOf("Is Delhi in USA ?","Is CP waste of time ?","Is Kotlin bit tough then Java ?","Is Gujarati best Language ?","Is Android dead ?")
    val answers = arrayOf(false,false,true,true,false)
    var scored = 0
    var queno = 0
//    var EXTRA_NAME2 = "com.example.quizapp.extra.NAME2"
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        answered = findViewById(R.id.answered)
        score = findViewById(R.id.score)
        question = findViewById(R.id.textView3)
        yes = findViewById(R.id.yes)
        no = findViewById(R.id.no)
        answered.setText("Answered $queno/"+questions.size)
        score.setText("Score : "+scored)
        question.setText(questions[queno])

        val namefrom2 = intent.getStringExtra("com.example.quizapp.extra.NAME")
        yes.setOnClickListener()
        {
            if(answers[queno])
            {
                scored++
            }
            queno++
            if(queno == questions.size)
            {
                val intent2 = Intent(this,MainActivity3::class.java)
                intent2.putExtra("Name",namefrom2)
                intent2.putExtra("Score",scored)
                startActivity(intent)
            }
            else
            {
                answered.text = "Answered $queno/"+questions.size
                score.setText("Score : "+scored)
                question.setText(questions[queno])
            }

        }
        no.setOnClickListener()
        {
            if(!answers[queno])
            {
                scored++
            }
            queno++
            if(queno == questions.size )
            {
                val intent2 = Intent(this,MainActivity3::class.java)
                intent2.putExtra("Name",namefrom2)
                intent2.putExtra("Score",scored)
                startActivity(intent2)
            }
            else
            {
                answered.setText("Answered $queno/"+questions.size)
                score.setText("Score : "+scored)
                question.setText(questions[queno])
            }
        }
    }
}