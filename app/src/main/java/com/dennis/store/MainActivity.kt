package com.dennis.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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


        et_User = findViewById(R.id.et_User)
        et_Pass = findViewById(R.id.et_Pass)


    }

    fun loguin(Vista: View){
        if(et_User.getText().toString().equals("admin") && et_Pass.getText().toString().equals("admin")){
            Toast.makeText(this,"Iniciando Sesion", Toast.LENGTH_SHORT).show();
            val loguin = Intent(this, SesionIniciada::class.java)
            startActivity(loguin)
        }else
            Toast.makeText(this,"Verifique Contraseña/Usuario", Toast.LENGTH_SHORT).show();
    }
    fun Agregar(Vista: View){
        val agregar = Intent(this, Registrar::class.java)
        startActivity(agregar)


    }
}