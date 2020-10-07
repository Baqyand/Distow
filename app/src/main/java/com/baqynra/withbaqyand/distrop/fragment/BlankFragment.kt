package com.baqynra.withbaqyand.distrop.fragment

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.baqynra.withbaqyand.distrop.R
import com.baqynra.withbaqyand.distrop.adapter.ListKaosAdapter
import com.baqynra.withbaqyand.distrop.adapter.TestAdapter
import com.baqynra.withbaqyand.distrop.model.Shirt
import kotlinx.android.synthetic.main.fragment_data.*

class BlankFragment : Fragment() {

    companion object {
        fun newInstance() = BlankFragment()
        const val EXTRA_NAME = "Nama Kaos"
        const val EXTRA_DETAIL = "Detail Kaos"
        const val EXTRA_HARGA = "Harga Kaos"
        const val EXTRA_IMAGE = "Image"
        lateinit var nama:String
        lateinit var harga:String
        lateinit var detail:String
        private var dataArray  = ArrayList<Shirt>()
        private lateinit var adapter: TestAdapter
    }

    private lateinit var viewModel: ViewData

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_data, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ViewData::class.java)
        // TODO: Use the ViewModel

        showdata()
    }
    private val mMessageReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent) {
            if(intent.hasExtra("Nama")){
                nama=intent.getStringExtra("Nama")!!
                harga=intent.getStringExtra("Detail")!!

                img_baju_name.text = nama
                img_harga.text = harga


            }
        }
    }
    private fun showdata(){
        BlankFragment.dataArray.add(Shirt("kaos","100000 - 500000","baju",R.drawable.bloods))
        BlankFragment.dataArray.add(Shirt("baju","200000","kaos",R.drawable.dreambirds))

        BlankFragment.adapter = TestAdapter(requireActivity())
        rvkaos.layoutManager = LinearLayoutManager(requireActivity())
        rvkaos.adapter = adapter

        BlankFragment.adapter.initData(BlankFragment.dataArray)
    }


    override fun onResume() {
        super.onResume()
        LocalBroadcastManager.getInstance(requireContext())
            .registerReceiver(mMessageReceiver, IntentFilter("Data Trigger"))
    }

    override fun onPause() {
        super.onPause()
        LocalBroadcastManager.getInstance(requireContext())
            .unregisterReceiver(mMessageReceiver)
    }

}