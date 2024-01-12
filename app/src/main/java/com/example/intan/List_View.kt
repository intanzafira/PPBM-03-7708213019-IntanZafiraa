package com.example.intan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class List_View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listview = findViewById<ListView>(R.id.listview)
        val names = arrayOf("Hari Ini", "7 Hari","1 Bulan")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )

        listview.adapter = arrayAdapter

        listview.setOnItemClickListener { parent, view, i, l ->
            Toast.makeText(this, "Item Selected" + names[i], Toast.LENGTH_LONG)
                .show()
        }

        val back = findViewById<TextView>(R.id.backbtn)
        back.setOnClickListener {
            val intent = Intent(this, ProfileAkunActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}