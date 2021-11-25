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

    fun ZAP1(Vista: View){
        val ZAP1 = Intent(this, ActivityZapato2::class.java)
        startActivity(ZAP1)

    }
}