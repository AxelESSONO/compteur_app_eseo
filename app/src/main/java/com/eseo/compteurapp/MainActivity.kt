package com.eseo.compteurapp
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var compteurText : TextView
    lateinit var increment : Button
    lateinit var decrement : Button
    var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        compteurText = findViewById(R.id.compteurText)
        increment = findViewById(R.id.incrementButton)
        decrement = findViewById(R.id.decrementButton)

        compteurText.text = "$count"

        increment.setOnClickListener {
            count++
            compteurText.text = "$count"
        }
        decrement.setOnClickListener {
            count--
            compteurText.text = "$count"
        }
    }
}