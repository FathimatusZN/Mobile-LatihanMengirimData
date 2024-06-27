package com.example.latihanmengirimdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtNamalengkap : EditText
    private lateinit var edtNamapanggilan : EditText
    private lateinit var edtNpm : EditText
    private lateinit var edtAlamat : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMoveWithDataActivity: Button =
            findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)
        edtNamalengkap = findViewById(R.id.edt_namalengkap)
        edtNamapanggilan = findViewById(R.id.edt_namapanggilan)
        edtNpm = findViewById(R.id.edt_npm)
        edtAlamat = findViewById(R.id.edt_alamat)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity_data -> {
                val namalengkapValue = edtNamalengkap.text.toString()
                val namapanggilanValue = edtNamapanggilan.text.toString()
                val npmValue = edtNpm.text.toString().toLong()
                val alamatValue = edtAlamat.text.toString()

                val moveWithDataIntent = Intent(this@MainActivity,
                    MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAMALENGKAP, namalengkapValue)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAMAPANGGILAN, namapanggilanValue)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NPM, npmValue)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_ALAMAT, alamatValue)

                startActivity(moveWithDataIntent)
            }
        }
    }
}
