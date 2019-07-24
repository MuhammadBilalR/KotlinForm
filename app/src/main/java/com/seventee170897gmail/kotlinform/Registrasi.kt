package com.seventee170897gmail.kotlinform


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.seventee170897gmail.kotlinform.R


class Registrasi : AppCompatActivity() {
    internal lateinit var btnOK: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        btnOK = findViewById<View>(R.id.btnOK) as Button

        btnOK.setOnClickListener {
            val intent = Intent(this@Registrasi, MainActivity::class.java)
            this@Registrasi.startActivity(intent)
        }
    }
}