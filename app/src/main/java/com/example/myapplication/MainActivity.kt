package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.text).text = "kone4"
        }
        findViewById<View>(R.id.button2).setOnClickListener {
            findViewById<TextView>(R.id.text).text = "kone5"
        }
    }
}