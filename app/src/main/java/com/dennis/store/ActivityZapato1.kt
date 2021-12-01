package com.dennis.store

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityZapato1 : AppCompatActivity() {
    private lateinit var txt_id:TextView
    private lateinit var txt_nombre:TextView
    private lateinit var txt_descripcion:TextView
    private lateinit var txt_precio:TextView
    private lateinit var btn_carrito:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zapato1)

        txt_id = findViewById(R.id.txt_id)
        txt_nombre = findViewById(R.id.txt_nombre)
        txt_descripcion = findViewById(R.id.txt_descripcion)
        txt_precio = findViewById(R.id.txt_precio)
        btn_carrito = findViewById(R.id.btn_carrito)


    }
/*
    fun registrar(Vista:View){
        val admin = AdminConexion(this, "tienda", null, 1)
        val BD: SQLiteDatabase? = admin.writableDatabase

        val id = "1"
        val nombre = "nike"
        val descripcion = "Buena calidad"
        val precio = 40


    }
*/


    fun seleccion(Vista: View){
        when (Vista.id){
            R.id.btn_carrito -> Toast.makeText(this,"Guardado al carrito",Toast.LENGTH_SHORT).show()
        }

    }
}