package com.example.latihanmengirimdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMALENGKAP = "extra_namalengkap"
        const val EXTRA_NAMAPANGGILAN = "extra_namapanggilan"
        const val EXTRA_NPM = "extra_npm"
        const val EXTRA_ALAMAT = "extra_alamat"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
        val tvDataNamaLengkap: TextView = findViewById(R.id.tv_data_namalengkap)
        val tvDataNamaPanggilan: TextView = findViewById(R.id.tv_data_namapanggilan)
        val tvDataNPM: TextView = findViewById(R.id.tv_data_npm)
        val tvDataAlamat: TextView = findViewById(R.id.tv_data_alamat)

        val namalengkap = intent.getStringExtra(EXTRA_NAMALENGKAP)
        val namapanggilan = intent.getStringExtra(EXTRA_NAMAPANGGILAN)
        val npm = intent.getLongExtra(EXTRA_NPM,0)
        val alamat = intent.getStringExtra(EXTRA_ALAMAT)

        tvDataNamaLengkap.text   = "Nama Lengkap : $namalengkap"
        tvDataNamaPanggilan.text = "Nama Panggilan : $namapanggilan"
        tvDataNPM.text           = "NPM : $npm"
        tvDataAlamat.text        = "Alamat : $alamat"
    }
}
