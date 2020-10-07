package com.baqynra.withbaqyand.distrop

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ListActivity : AppCompatActivity(), View.OnClickListener {
    companion object{

        const val EXTRA_NAME = "Nama Kaos"
        const val EXTRA_DETAIL = "Detail Kaos"
        const val EXTRA_HARGA = "Harga Kaos"
        const val EXTRA_IMAGE = "Imag"


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val imgfoto: ImageView = findViewById(R.id.img_baju)
//        val imgfoto = img_baju
        val tvkaos: TextView = findViewById(R.id.img_baju_name)
        val tvdetail:TextView = findViewById(R.id.img_baju_detail)
        val price:TextView = findViewById(R.id.img_harga)
        val btnklik:Button = findViewById(R.id.btn_dial)
//        val btnklik = btn_dial
//
//
        imgfoto.setImageResource(intent.getIntExtra(EXTRA_IMAGE,0))

        tvkaos.setText(intent.getStringExtra(EXTRA_NAME))

        tvdetail.setText(intent.getStringExtra(EXTRA_DETAIL))
        price.setText(intent.getStringExtra(EXTRA_HARGA))

        btnklik.setOnClickListener(this)

//        Glide.with(this).load(foto).apply(RequestOptions()).into(imgfoto)

    }


    override fun onClick(p: View) {
        when(p.id){
            R.id.btn_dial ->{
                val nomor = " 085708339519"
                val moveintent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$nomor"))
                startActivity(moveintent)
            }
        }
    }
}


