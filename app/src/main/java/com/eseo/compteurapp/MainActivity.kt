package com.eseo.compteurapp
import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
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
    lateinit var compteurPref : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        compteurText = findViewById(R.id.compteurText)
        increment = findViewById(R.id.incrementButton)
        decrement = findViewById(R.id.decrementButton)

        compteurViewModel = ViewModelProvider(this)
            .get(CompteurViewModel::class.java)

        compteurText.text = "${compteurViewModel.count}"

        increment.setOnClickListener{
            compteurViewModel.incrementer()
            compteurText.text = "${compteurViewModel.count}"
        }
        decrement.setOnClickListener {
            compteurViewModel.decrement()
            compteurText.text = "${compteurViewModel.count}"
        }
    }

    fun saveCompteur(){
        compteurPref = getSharedPreferences(
            "Compteur_pref",
            Context.MODE_PRIVATE
        )
        val compteurEditor : SharedPreferences.Editor
        compteurEditor = compteurPref.edit()

        compteurEditor.putInt(
            "compteur",
            compteurViewModel.count
        )
        compteurEditor.apply()
    }

    fun getCompteur() : Int {
       return compteurPref.getInt(
            "compteur",
            compteurViewModel.count
        )
    }
}



















































