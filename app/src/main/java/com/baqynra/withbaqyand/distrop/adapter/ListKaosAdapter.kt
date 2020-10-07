package com.baqynra.withbaqyand.distrop.adapter


import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Parcel
import android.os.Parcelable
import android.os.ProxyFileDescriptorCallback
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.RecyclerView
import com.baqynra.withbaqyand.distrop.MainActivity
import com.baqynra.withbaqyand.distrop.R
import com.baqynra.withbaqyand.distrop.model.Shirt
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_distrop.view.*
import java.util.ArrayList
import kotlin.math.log

class ListKaosAdapter(val listKaos: ArrayList<Shirt> ): RecyclerView.Adapter<ListKaosAdapter.ListViewHolder>() {
//    private lateinit var onItemClickCallback: OnItemClickCallback
    private lateinit var context : Context

//
//    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
//        this.onItemClickCallback = onItemClickCallback
//    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.img_baju_name
        var tvdetail: TextView = itemView.img_baju_detail
        var layout: ConstraintLayout = itemView.layout
        var tvharga: TextView = itemView.img_harga
        var foto: ImageView = itemView.img_baju
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_distrop, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kaos = listKaos[position]



        Glide.with(holder.itemView.context).load(kaos.photo)
            .apply(RequestOptions().override(250, 250)).into(holder.foto)

        holder.tvName.text = kaos.name
        holder.tvdetail.text = kaos.detail
        holder.tvharga.text = kaos.harga

        holder.layout.setOnClickListener {
            val intent = Intent("ACTION_GO")
            intent.putExtra("harga",kaos.harga)
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent)
            Log.e("LOG","Sending Broadcast")
        }




//        holder.itemView.setOnClickListener {
//            onItemClickCallback.onItemClicked(listKaos.get(holder.adapterPosition))
//
//
//
//        }

    }

    override fun getItemCount(): Int {
        return listKaos.size
    }


//    interface OnItemClickCallback {
//        fun onItemClicked(data: Shirt)
//
//    }
}
