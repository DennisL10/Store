package com.dennis.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityZapato1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zapato1)
    }
    fun carrito(Vista: View){
        val carrit = Intent(this, ActivityZapato2::class.java)
        startActivity(carrit)
    }
}