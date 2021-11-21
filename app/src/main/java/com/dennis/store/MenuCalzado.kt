package com.dennis.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuCalzado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_calzado)
    }

    fun Info(Vista: View){
        val Info = Intent(this, ActivityZapato1::class.java)
        startActivity(Info)

    }
}