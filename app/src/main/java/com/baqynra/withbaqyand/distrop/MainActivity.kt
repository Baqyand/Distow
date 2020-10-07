package com.baqynra.withbaqyand.distrop

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.baqynra.withbaqyand.distrop.adapter.ListKaosAdapter
import com.baqynra.withbaqyand.distrop.model.Detail
import com.baqynra.withbaqyand.distrop.model.Shirt
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    //a List of type  for holding list items
    private lateinit var showkaos: RecyclerView
    private var list: ArrayList<Shirt> = arrayListOf()
//    val imgfoto: ImageView = findViewById(R.id.img_baju)
//    val tvkaos: TextView = findViewById(R.id.img_baju_name)
//    val tvdetail:TextView = findViewById(R.id.img_baju_detail)
//    val price:TextView = findViewById(R.id.img_harga)
    companion object{

        const val EXTRA_NAME = "Nama Kaos"
        const val EXTRA_DETAIL = "Detail Kaos"
        const val EXTRA_HARGA = "Harga Kaos"
        const val EXTRA_IMAGE = "Image"




    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        LocalBroadcastManager.getInstance(context).registerReceiver(receiver, IntentFilter("lihat_yang_ketrigger"))
      

//        showkaos = rvkaos
//        showkaos.setHasFixedSize(true)
//
//        list.addAll(Detail.listData)
//        showlist()

    }

    private val receiver : BroadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent) {
            if (intent.hasExtra("harga")) {
//                imgfoto.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))
//                tvkaos.setText(intent.getStringExtra(EXTRA_NAME))
//                tvdetail.setText(intent.getStringExtra(EXTRA_DETAIL))

//                img_harga.setText(intent.getStringExtra("harga"))
            }

        }
    }

    private fun showlist() {
//        rvkaos.layoutManager = LinearLayoutManager(this)
//        val listKaosAdapter = ListKaosAdapter(list)
//        rvkaos.adapter = listKaosAdapter

//        listKaosAdapter.setOnItemClickCallback(object :ListKaosAdapter.OnItemClickCallback{
//            override fun onItemClicked(data: Shirt) {
//                sendBroadCast(data)
//
//            }
//
//        })

    }
    fun sendBroadCast( kaos: Shirt){
        val intent = Intent("ACTION_GO")
        intent.putExtra("EXTRA_TEXT", "Broadcast received");
        sendBroadcast(intent);
//        val intent = Intent("ACTION_GO")
//        intent.putExtra(EXTRA_IMAGE, kaos.photo)
//        intent.putExtra(EXTRA_NAME,kaos.name)
//        intent.putExtra(EXTRA_DETAIL,kaos.detail)
//        intent.putExtra(EXTRA_HARGA,kaos.harga)
//        sendBroadcast(intent)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return onOptionsItemSelected(item)
    }

    override fun onResume() {
        super.onResume()
        LocalBroadcastManager.getInstance(this).registerReceiver(receiver, IntentFilter("ACTION_GO"))
    }

    override fun onPause() {
        super.onPause()

    }

//    override fun onStart() {
//        super.onStart()
////        val filter = IntentFilter("ACTION_GO")
////        registerReceiver(receiver, filter)
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        unregisterReceiver(receiver)
//    }


}
//    override fun onDestroy() {
//        unregisterReceiver(receiver)
//        super.onDestroy()
//    }
//val receiver : BroadcastReceiver = object : BroadcastReceiver(){
//                override fun onReceive(context: Context?, intent: Intent) {
//
//                    if(intent.hasExtra(EXTRA_IMAGE)){
//
//                    }
//                }
//
//        }
//        registerReceiver(receiver, filter)

//            var detail =
//            detail.putExtra(EXTRA_IMAGE,kaos.photo)
//            detail.putExtra(EXTRA_NAME,kaos.name)
//            detail.putExtra(EXTRA_DETAIL,kaos.detail)
//            detail.putExtra(EXTRA_HARGA,kaos.harga)
//            startActivity(detail)
//
//   private fun showsselected(kaos: Shirt) {
////        val send = Intent("ACTION_GO")
////
////        send.putExtra(EXTRA_IMAGE, kaos.photo)
////        send.putExtra(EXTRA_NAME,kaos.name)
////        send.putExtra(EXTRA_DETAIL,kaos.detail)
////        send.putExtra(EXTRA_HARGA,kaos.harga)
////        sendBroadcast(send)
////
////
////
////    }