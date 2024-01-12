package com.example.intan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProfileAkunActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_akun)

        val beranda = findViewById<Button>(R.id.beranda)
        beranda.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
            finish()
        }

        val fav = findViewById<Button>(R.id.favorit)
        fav.setOnClickListener {
            val intent = Intent(this, FavoritActivity::class.java)
            startActivity(intent)
            finish()
        }

        val promoharga = findViewById<Button>(R.id.promo)
        promoharga.setOnClickListener {
            val intent = Intent(this, PromoHargaActivity::class.java)
            startActivity(intent)
            finish()
        }

        val profileuser = findViewById<ImageView>(R.id.profileuser)
        profileuser.setOnClickListener {
            val intent = Intent(this, ProfileUserActivity::class.java)
            startActivity(intent)
            finish()
        }
        val keluar = findViewById<ImageView>(R.id.keluar)
        keluar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val notif = findViewById<TextView>(R.id.notifikasi)
        notif.setOnClickListener {
            val intent = Intent(this, List_View::class.java)
            startActivity(intent)
            finish()
        }

        val purchase = findViewById<TextView>(R.id.purchase)
        purchase.setOnClickListener {
            val intent2 = Intent(this, PurchaseActivity::class.java)
            startActivity(intent2)
            finish()
        }

    }
}