package com.example.intan

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.intan.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    private lateinit var listAdapter: listadapter
    private lateinit var listData: listdata
    var dataArrayList = ArrayList<listdata?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = intArrayOf(
            R.drawable.cimory1,
            R.drawable.cocacola,
            R.drawable.sprite
        )
        val ingredientList = intArrayOf(
            R.string.pastaIngredients,
            R.string.burgerIngredients,
            R.string.friesIngredients
        )
        val descList = intArrayOf(
            R.string.pastaDesc,
            R.string.burgerDesc,
            R.string.friesDesc
        )
        val nameList = arrayOf("Cimory", "Cocacola", "Sprite")
        val timeList = arrayOf("30 mins", "45 mins", "40 mins")

        for (i in imageList.indices) {
            listData = listdata(
                nameList[i],
                timeList[i], ingredientList[i], descList[i], imageList[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = listadapter(this@MenuActivity, dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true

        binding.listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@MenuActivity, DetailedActivity::class.java)
            intent.putExtra("name", nameList[i])
            intent.putExtra("time", timeList[i])
            intent.putExtra("ingredients", ingredientList[i])
            intent.putExtra("desc", descList[i])
            intent.putExtra("image", imageList[i])
            startActivity(intent)
        }

        val backbtn = findViewById<TextView>(R.id.backbtn)
        backbtn.setOnClickListener {
            val lgn = Intent(this, BerandaActivity::class.java)
            startActivity(lgn)
            finish()
        }
    }
}