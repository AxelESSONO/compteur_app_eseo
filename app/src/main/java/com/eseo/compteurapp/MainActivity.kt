package com.eseo.compteurapp
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var compteurText : TextView
    lateinit var increment : Button
    lateinit var decrement : Button
    lateinit var compteurViewModel: CompteurViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        compteurText = findViewById(R.id.compteurText)
        increment = findViewById(R.id.incrementButton)
        decrement = findViewById(R.id.decrementButton)

        compteurViewModel = ViewModelProvider(this)
            .get(CompteurViewModel::class.java)

        compteurText.text = "${compteurViewModel.count}"

        increment.setOnClickListener {
            compteurViewModel.incrementer()
            compteurText.text = "${compteurViewModel.count}"
        }
        decrement.setOnClickListener {
            compteurViewModel.decrement()
            compteurText.text = "${compteurViewModel.count}"
        }
    }
}