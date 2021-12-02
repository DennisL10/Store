package com.dennis.store

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class AdminConexion (
    context: Context?,
    name: String?,
    factory: SQLiteDatabase.CursorFactory?,
    version: Int
    ) : SQLiteOpenHelper(context, name, factory, version) {
        override fun onCreate(UsuConexion: SQLiteDatabase?) {
            UsuConexion?.execSQL("Create table usuario(id int primary key, Nombre text, Apellido text, Direccion text, DireccionE text, Usuario text, Contra text)")
        }

        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
            TODO("Not yet implemented")

        }
}

