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
        val carrit2 = Intent(this, ActivityZapato2::class.java)
        startActivity(carrit2)

    }

    fun carrito3(Vista: View){
        val carrit3 = Intent(this, ActivityZapato3::class.java)
        startActivity(carrit3)
    }

    fun carrito4(Vista: View){
        val carrit4 = Intent(this, ActivityZapato4::class.java)
        startActivity(carrit4)
    }

    fun carrito5(Vista: View){
        val carrit5 = Intent(this, ActivityZapato5::class.java)
        startActivity(carrit5)
    }


}