package com.dennis.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuZapato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuzapato)
    }

    fun Infoo(Vista: View){
        val Infoo = Intent(this, ActivityZapato2::class.java)
        startActivity(Infoo)

    }


}