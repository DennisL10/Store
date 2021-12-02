package com.dennis.store

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityZapato1 : AppCompatActivity() {
    private lateinit var txt_id:TextView
    private lateinit var txt_nombre:TextView
    private lateinit var txt_descripcion:TextView
    private lateinit var txt_precio:TextView
    private lateinit var btn_carrito:TextView
    private lateinit var tv_Cnombre:TextView
    private lateinit var tv_Capellido:TextView
    private lateinit var tv_Cdireccion:TextView
    private lateinit var tv_CdireccionE:TextView
    private lateinit var et_Uus:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zapato1)

        txt_id = findViewById(R.id.txt_id)
        txt_nombre = findViewById(R.id.txt_nombre)
        txt_descripcion = findViewById(R.id.txt_descripcion)
        txt_precio = findViewById(R.id.txt_precio)
        btn_carrito = findViewById(R.id.btn_carrito)


    }
    fun Buscar(Vista:View) {

            Toast.makeText(this,"COMPRA EXITOSA", Toast.LENGTH_LONG).show()
    }

}

