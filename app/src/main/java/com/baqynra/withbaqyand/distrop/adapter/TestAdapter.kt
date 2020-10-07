package com.baqynra.withbaqyand.distrop.adapter
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.RecyclerView
import com.baqynra.withbaqyand.distrop.R
import com.baqynra.withbaqyand.distrop.model.Shirt
import kotlinx.android.synthetic.main.item_distrop.view.*


class TestAdapter(private val context: Context) : RecyclerView.Adapter<TestAdapter.NamaKelompokViewHolder>() {
    private val dataArray= ArrayList<Shirt>()
    fun addData(data:MutableList<Shirt>){
        dataArray.addAll(data)
        notifyDataSetChanged()
    }
    fun initData(data:MutableList<Shirt>){
        dataArray.clear()
        dataArray.addAll(data)
        notifyDataSetChanged()
    }

    fun clearData(){
        dataArray.clear()
        notifyDataSetChanged()
    }

    fun subtractData(){
        dataArray.removeAt(dataArray.size-1)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamaKelompokViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_distrop, parent, false)
        return NamaKelompokViewHolder(view)
    }

    override fun onBindViewHolder(holder: NamaKelompokViewHolder, position: Int) {
        holder.foto.setImageResource(dataArray[position].photo)
        holder.name.text = dataArray[position].name
        holder.harga.text = dataArray[position].harga
        holder.detail.setOnClickListener {
            val mydata = Intent("Data Trigger")
//            mydata.putExtra("id_gedung", dataArray[position].idGedung)
            mydata.putExtra("Nama",dataArray[position].name)
            mydata.putExtra("Detail",dataArray[position].detail)
            LocalBroadcastManager.getInstance(context).sendBroadcast(mydata)

        }
    }



    override fun getItemCount(): Int {
        return dataArray.size
    }

    inner class NamaKelompokViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto= itemView.img_baju
        val name: TextView = itemView.img_baju_name
        val harga = itemView.img_harga
        val detail = itemView.img_baju_detail
    }

}