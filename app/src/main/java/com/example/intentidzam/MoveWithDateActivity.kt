package com.example.intentidzam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.TextViewCompat

class MoveWithDateActivity() : AppCompatActivity(), View.OnClickListener {
    private lateinit var tvDataReceived: TextView
    private lateinit var btnMenu1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_date)

        tvDataReceived = findViewById(R.id.tv_data_received)
        DataReceived()
        btnMenu1 = findViewById(R.id.btn_Menu1)
        btnMenu1.setOnClickListener(this)
    }

    private fun DataReceived() {
        val bundle = intent.extras
        val nama = bundle?.getString("Nama")
        val prodi = bundle?.getString("Prodi")
        val nim = bundle?.getString("Nim")

        tvDataReceived.text = nama + " " + prodi + " " + nim
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btn_Menu1 -> run {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}

