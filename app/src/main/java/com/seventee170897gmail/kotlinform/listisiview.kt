package com.seventee170897gmail.kotlinform

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.seventee170897gmail.kotlinform.R

class listisiview
(private val context: Activity, private val maintitle: Array<String>, private val subtitle: Array<String>, private val imgid: Array<Int>)//Mebngatur urutana varible dengan isinya yang akan diutampilkan pada listview

    : ArrayAdapter<String>(context, R.layout.activity_listisiview, maintitle) {
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_listisiview, null, true)
        val titleText = rowView.findViewById<View>(R.id.title) as TextView
        val imageView = rowView.findViewById<View>(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById<View>(R.id.subtitle) as TextView
        titleText.text = maintitle[position]
        imageView.setImageResource(imgid[position])
        subtitleText.text = subtitle[position]
        return rowView
    }
}