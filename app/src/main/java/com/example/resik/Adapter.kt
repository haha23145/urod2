package com.example.resik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val array: ArrayList<MyClass>) :RecyclerView.Adapter<Adapter.ViewHolder>(){

    class ViewHolder(item : View):RecyclerView.ViewHolder(item){

        val image: ImageView = item.findViewById(R.id.i)
        val name : TextView = item.findViewById(R.id.name)
        val surName: TextView = item.findViewById(R.id.surName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val myViewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(myViewHolder)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.name.text = array[position].name
       holder.surName.text = array[position].surName
    }

    override fun getItemCount(): Int {
        return array.size
    }
}