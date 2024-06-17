package com.example.practkotl8

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val rButton: Button = findViewById(R.id.red_button)
        val yButton: Button = findViewById(R.id.yellow_button)
        val gButton: Button = findViewById(R.id.green_button)
        val textView: TextView = findViewById(R.id.textView)
        val rLayout:ConstraintLayout = findViewById(R.id.root_layout)
        rButton.setOnClickListener{
            textView.text = "Красный"
            rLayout.setBackgroundColor(resources.getColor(R.color.red, null))
        }
        yButton.setOnClickListener{
            textView.text = "Желтый"
            rLayout.setBackgroundColor(resources.getColor(R.color.yellow, null))
        }
        gButton.setOnClickListener{
            textView.text = "Зелёный"
            rLayout.setBackgroundColor(resources.getColor(R.color.green, null))
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}