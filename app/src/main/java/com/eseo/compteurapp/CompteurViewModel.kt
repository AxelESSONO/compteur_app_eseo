package com.eseo.compteurapp

import androidx.lifecycle.ViewModel
class CompteurViewModel : ViewModel() {
    var count : Int = 0

    fun incrementer(){
        count++
    }
    fun decrement(){
        count--
    }
}