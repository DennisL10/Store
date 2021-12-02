package com.dennis.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ActivityZapato2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zapato2)
    }
    fun Buscar(Vista: View) {

        Toast.makeText(this,"COMPRA EXITOSA", Toast.LENGTH_LONG).show()
    }
}