package com.dennis.store

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var et_User: EditText
    private lateinit var et_Pass: EditText
    private lateinit var btnRegister: Button
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister = findViewById(R.id.btnRegister)
        btnLogin = findViewById(R.id.btnLogin)
        et_User = findViewById(R.id.et_Nombre)
        et_Pass = findViewById(R.id.et_Pass)



    }

    fun loguin(Vista: View){
        val admin = AdminConexion(this, "Store", null, version = 1)
        val usua: SQLiteDatabase = admin.writableDatabase // Se crea la conexion a la BD

        val usu = et_User.text.toString()
        val pass = et_Pass.text.toString()

        if(!usu.isEmpty() && !pass.isEmpty()){



            Toast.makeText(this,"Sesion Iniciada", Toast.LENGTH_SHORT).show();
            val loguin = Intent(this, SesionIniciada::class.java)
            startActivity(loguin)
            usua.close()
        }else
            Toast.makeText(this,"Verifique Contraseña/Usuario", Toast.LENGTH_SHORT).show();

    }
    fun Agregar(Vista: View){
        val agregar = Intent(this, Registrar::class.java)
        startActivity(agregar)

    }
}