package com.dennis.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainZapatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainzapatos)
    }


    fun carrito(Vista: View)
    {
        val carrit = Intent(this, ActivityZapato1::class.java)
        startActivity(carrit)

    }

    fun carrito2(Vista: View)
    {
        val carrit = Intent(this, ActivityZapato2::class.java)
        startActivity(carrit)

    }

    fun carrito3(Vista: View){
        val carrit = Intent(this, ActivityZapato4::class.java)
        startActivity(carrit)
    }

    fun carrito4(Vista: View){
        val carrit = Intent(this, ActivityZapato4::class.java)
        startActivity(carrit)
    }

    fun carrito5(Vista: View){
        val carrit = Intent(this, ActivityZapato5::class.java)
        startActivity(carrit)
    }


}