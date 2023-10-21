package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterEmailItem (private val myList: List<Item>) : RecyclerView.Adapter<AdapterEmailItem.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemViw = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false);
        return MyViewHolder(itemViw);
    }

    override fun getItemCount(): Int {
        return myList.size;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val name = myList[position].name;
        val description = myList[position].description;
        holder.textName.text = name;
        holder.description.text = description;
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textName: TextView = itemView.findViewById(R.id.txt_user);
        val description: TextView = itemView.findViewById(R.id.txt_subject);
    }
}