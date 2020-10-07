package com.baqynra.withbaqyand.distrop

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.baqynra.withbaqyand.distrop.adapter.ListKaosAdapter
import com.baqynra.withbaqyand.distrop.adapter.TestAdapter
import com.baqynra.withbaqyand.distrop.fragment.BlankFragment
import com.baqynra.withbaqyand.distrop.model.Shirt
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_data.*

class TestActivity : AppCompatActivity() {

    companion object{
        private var dataArray  = ArrayList<Shirt>()
        private lateinit var adapter: TestAdapter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }


}