package com.example.imadpracticum_st10456573_caitlynjeniker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)

        val button2 = findViewById<Button>(R.id.button2)



        button1.setOnClickListener {





            startActivity(intent)

        }

        button2.setOnClickListener {

            finish()
        }
        }
}