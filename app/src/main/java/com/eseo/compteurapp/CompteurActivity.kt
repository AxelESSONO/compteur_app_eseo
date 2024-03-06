package com.eseo.compteurapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CompteurActivity : AppCompatActivity() {

    lateinit var compteurText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compteur)

        compteurText = findViewById(R.id.compteurText)
        compteurText.text = "${intent.getIntExtra("compteur", 0)}"

    }
}