package com.seventee170897gmail.kotlinform

import android.content.Intent
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.seventee170897gmail.kotlinform.R

class Login : AppCompatActivity() {

    internal lateinit var username: EditText
    internal lateinit var password: EditText
    internal lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        username = findViewById<View>(R.id.username) as EditText
        password = findViewById<View>(R.id.password) as EditText
        btnLogin = findViewById<View>(R.id.btnLogin) as Button


        btnLogin.setOnClickListener {
            val usernameKey = username.text.toString()
            val passwordKey = password.text.toString()

            if (usernameKey == "Muhbil" && passwordKey == "165410107") {

                Toast.makeText(applicationContext, "LOGIN SUKSES",
                        Toast.LENGTH_SHORT).show()
                val intent = Intent(this@Login, MainActivity::class.java)
                this@Login.startActivity(intent)
                finish()

            } else {

                val builder = AlertDialog.Builder(this@Login)
                builder.setMessage("Username atau Password Anda salah!")
                        .setNegativeButton("Retry", null).create().show()

            }
        }

    }


    fun ButtonOnClick(View: View) {
        val intent = Intent(this@Login, Registrasi::class.java)
        this@Login.startActivity(intent)

    }
}