package com.dennis.store

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class ActivityCarrito : AppCompatActivity() {

    private  lateinit var et_codigo:EditText
    private  lateinit var et_nombre:EditText
    private  lateinit var et_descripcion:EditText
    private  lateinit var et_precio:EditText
    private  lateinit var btn_agregar:EditText
    private  lateinit var btn_buscar:EditText
    private  lateinit var btn_Eliminar:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        et_codigo = findViewById(R.id.et_codigo)
        et_nombre = findViewById(R.id.et_nombre)
        et_descripcion = findViewById(R.id.et_descripcion)
        et_precio = findViewById(R.id.et_precio)

    }

    //Fun-para registrar

    fun RegistrarZapato(Vista:View)
    {
        val adminn = AdminConexion(this, "Store", null, 1)
        val BD:SQLiteDatabase = adminn.writableDatabase

        val codigo = et_codigo.text.toString()
        val nombre = et_nombre.text.toString()
        val descripcion = et_descripcion.text.toString()
        val precio = et_precio.text.toString()

        if(!codigo.isEmpty() && !nombre.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty())
        {
            val registro = ContentValues().apply{
                put("id", codigo)
                put("nombre", nombre)
                put("description", descripcion)
                put("precio", precio)
            }


            BD.insert("Zapatos",null,registro)
            BD.close()

            et_codigo.setText("")
            et_descripcion.setText("")
            et_precio.setText("")
            Toast.makeText(this,"Registro exitoso",Toast.LENGTH_SHORT).show()

        }else
        {
            Toast.makeText(this,"Debes llenar todos los campos",Toast.LENGTH_SHORT).show()
        }
    }


    fun Buscar(Vista:View){
        val adminn = AdminConexion(this,"Store",null,1)
        val BD:SQLiteDatabase = adminn.writableDatabase //se crea la conexion a la base de datos



        val codigo = et_codigo.text.toString()

        if(!codigo.isEmpty())
        {

            val file = BD.rawQuery("select nombre, descripcion, precio from Zapatos where codigo=$codigo",null)

            if(file.moveToFirst())
            {
                et_nombre.setText(file.getString(0))
                et_descripcion.setText(file.getString(1))
                et_precio.setText(file.getString(2))
                BD.close()

            }else{
                Toast.makeText(this,"No existe el producto",Toast.LENGTH_LONG).show()
                BD.close()
            }
        }else{
            Toast.makeText(this,"Debes ingresar el id del producto",Toast.LENGTH_LONG).show()
        }

    }



    fun Eliminar(Vista: View)
    {

        val adminn = AdminConexion(this, "Store", null, 1)
        val BD: SQLiteDatabase = adminn.writableDatabase //se crea la conexion a la base de d


        val codigo = et_codigo.text.toString()
        if(!codigo.isEmpty())
        {
            val cantidad:Int = BD.delete("Zapatos","codigo=$codigo",null)
            BD.close()
            et_codigo.setText("")
            et_nombre.setText("")
            et_descripcion.setText("")
            et_precio.setText("")


            if(cantidad==1)
            {

                Toast.makeText(this, "Producto eliminado exitosamente del carrito ", Toast.LENGTH_LONG).show()

            }else
            {
                Toast.makeText(this, "No existe el producto ", Toast.LENGTH_LONG).show()
                BD.close()
            }


        }else
        {
            Toast.makeText(this, "Debe insertar un id del producto ", Toast.LENGTH_LONG).show()
        }

    }





}