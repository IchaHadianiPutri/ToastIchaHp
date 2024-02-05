package com.example.toastichahp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Aplikasi Berjalan" ,Toast.LENGTH_SHORT).show()

        val nama= findViewById<Button>(R.id.tombolNama)
        val nis= findViewById<Button>(R.id.tombolNis)
        val kelas= findViewById<Button>(R.id.tombolKelas)

        nama.setOnClickListener {
            Toast.makeText(this,"Icha Hadiani Putri", Toast.LENGTH_SHORT).show()
        }
        nis.setOnClickListener {
            Toast.makeText(this,"2233290", Toast.LENGTH_SHORT).show()
        }
        kelas.setOnClickListener {
            Toast.makeText(this,"XI PPLG 2", Toast.LENGTH_SHORT).show()
        }
    }
}