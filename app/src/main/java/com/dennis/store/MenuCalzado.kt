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

    fun Info1(Vista: View){
        val Info1 = Intent(this, ActivityZapato2::class.java)
        startActivity(Info1)

    }

    fun Info2(Vista: View){
        val Info2 = Intent(this, ActivityZapato3::class.java)
        startActivity(Info2)

    }

    fun Info3(Vista: View){
        val Info3 = Intent(this, ActivityZapato4::class.java)
        startActivity(Info3)

    }

    fun Info4(Vista: View){
        val Info4 = Intent(this, ActivityZapato5::class.java)
        startActivity(Info4)

    }

    fun Info5(Vista: View){
        val Info5 = Intent(this, ActivityZapato6::class.java)
        startActivity(Info5)

    }

}