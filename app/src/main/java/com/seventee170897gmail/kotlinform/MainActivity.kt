package com.seventee170897gmail.kotlinform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.seventee170897gmail.kotlinform.R

class MainActivity : AppCompatActivity() {
    internal lateinit var list: ListView

    internal var maintitle = arrayOf("Muhammad Nur Ashidiq", "Antonius Jonatan", "Emanuel Krowe", "Mikael Dionito", "Nurul Islamy", "Miftahul Ulum", "Rohmanto", "Danis Pangestu", "Sahril", "Zaqie", "Danang")

    internal var subtitle = arrayOf("sidiq@gmail.com", "anton@gmail.com", "emanuel@gmail.com", "mikael@gmail.com", "nurul@gmail.com", "ulum@gmail.com", "rohmanto@gmail.com", "danis@gmail.com", "sahril@gmail.com", "zaqie@gmail.com", "danang@gmail.com")

    internal var imgid = arrayOf<Int>(R.drawable.download_1, R.drawable.download_2, R.drawable.download_3, R.drawable.download_4, R.drawable.download_5, R.drawable.download_6, R.drawable.download_7, R.drawable.download_8, R.drawable.download_9, R.drawable.download_10, R.drawable.download_11)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = listisiview(this, maintitle, subtitle, imgid)
        list = findViewById<View>(R.id.list) as ListView
        list.adapter = adapter
        list.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->


            if (position == 0) {
                Toast.makeText(applicationContext, "Muhammad Nur Ashidiq", Toast.LENGTH_SHORT).show()
            } else if (position == 1) {
                Toast.makeText(applicationContext, "Antonius Jonatan", Toast.LENGTH_SHORT).show()
            } else if (position == 2) {
                Toast.makeText(applicationContext, "Emanuel Krowe", Toast.LENGTH_SHORT).show()
            } else if (position == 3) {
                Toast.makeText(applicationContext, "Mikael Dionito", Toast.LENGTH_SHORT).show()
            } else if (position == 4) {
                Toast.makeText(applicationContext, "Nurul Islamy", Toast.LENGTH_SHORT).show()
            } else if (position == 5) {
                Toast.makeText(applicationContext, "Miftahul Ulum", Toast.LENGTH_SHORT).show()
            } else if (position == 6) {
                Toast.makeText(applicationContext, "Rohmanto", Toast.LENGTH_SHORT).show()
            } else if (position == 7) {
                Toast.makeText(applicationContext, "Danis", Toast.LENGTH_SHORT).show()
            } else if (position == 8) {
                Toast.makeText(applicationContext, "Sahril", Toast.LENGTH_SHORT).show()
            } else if (position == 9) {
                Toast.makeText(applicationContext, "Zaqie", Toast.LENGTH_SHORT).show()
            } else if (position == 10) {
                Toast.makeText(applicationContext, "Danang", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
