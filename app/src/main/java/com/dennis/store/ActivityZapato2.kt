package com.dennis.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityZapato2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zapato2)
    }

    fun Main(Vista: View){
        val Main = Intent(this, SesionIniciada::class.java)
        startActivity(Main)

    }

    fun ZAP2(Vista: View){
        val ZAP2 = Intent(this, ActivityZapato1::class.java)
        startActivity(ZAP2)

    }

}