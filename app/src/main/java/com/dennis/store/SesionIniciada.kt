package com.dennis.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SesionIniciada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sesion_iniciada)
    }
    fun Menu(Vista: View){
        val menu = Intent(this, MenuZapato::class.java)
        startActivity(menu)

    }
}