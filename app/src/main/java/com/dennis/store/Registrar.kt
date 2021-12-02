package com.dennis.store

import android.content.ContentValues
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registrar : AppCompatActivity() {
    private lateinit var et_Nombre:EditText
    private lateinit var et_Apellido:EditText
    private lateinit var et_DIreccion:EditText
    private lateinit var et_DireccionE:EditText
    private lateinit var et_Usuario:EditText
    private lateinit var et_Contraseña:EditText
    private lateinit var btn_Registrar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        et_Nombre = findViewById(R.id.et_Nombre)
        et_Apellido = findViewById(R.id.et_Apellidos)
        et_DIreccion = findViewById(R.id.et_Direccion)
        et_DireccionE = findViewById(R.id.et_DireccionEspeci)
        et_Usuario = findViewById(R.id.et_AñadirUsu)
        et_Contraseña = findViewById(R.id.et_AñadirContra)
        btn_Registrar = findViewById(R.id.btnRegistro)

    }

    fun Regist (Vista: View){

        val admin = AdminConexion(this, "Store", null, version = 1)
        val DB: SQLiteDatabase = admin.writableDatabase // Se crea la conexion a la BD

        val Nombre = et_Nombre.text.toString()
        val Apellido = et_Apellido.text.toString()
        val Direccion = et_DIreccion.text.toString()
        val DireccionE = et_DireccionE.text.toString()
        val Usuario = et_Usuario.text.toString()
        val Contra = et_Contraseña.text.toString()

        if(!Nombre.isEmpty() && !Apellido.isEmpty() && !Direccion.isEmpty()
            && !DireccionE.isEmpty() && !Usuario.isEmpty() && !Contra.isEmpty()){
            val Regis = ContentValues().apply {
                put("Nombre", Nombre)
                put("Apellido", Apellido)
                put("Direccion", Direccion)
                put("DireccionE", DireccionE)
                put("Usuario", Usuario)
                put("Contra", Contra)

            }
            DB.insert("usuario", null, Regis)
            DB.close() // Cerramos la DB

            et_Nombre.setText("")
            et_Apellido.setText("")
            et_DIreccion.setText("")
            et_DireccionE.setText("")
            et_Usuario.setText("")
            et_Contraseña.setText("")
            Toast.makeText(this, "Se registro exitosammente" , Toast.LENGTH_SHORT).show()
            val inicio = Intent(this, MainActivity::class.java)
            startActivity(inicio)

        }else{
            Toast.makeText(this,"Debes llenar todos los campos", Toast.LENGTH_SHORT).show()
        }



    }

}
