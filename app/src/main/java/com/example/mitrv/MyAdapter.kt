package com.example.mitrv

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MyAdapter(var itemList : ArrayList<TeachersData>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun holdingViews(data : TeachersData){
            var teacherName = itemView.findViewById<TextView>(R.id.textViewTeacher)
            var subject = itemView.findViewById<TextView>(R.id.textViewSubject)

            teacherName.setText(data.name)
            subject.setText(data.subject)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.holdingViews(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}