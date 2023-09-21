package com.example.goodwords

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListVeiwAdapter (val list : MutableList<String>): BaseAdapter(){
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int,convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        if(convertView==null){
            if (parent != null) {
                convertView=LayoutInflater.from(parent.context).inflate(R.layout.listview_item,parent,false)
            }

        }
        val listviewText= convertView?.findViewById<TextView>(R.id.listViewTextArea)
        listviewText!!.text = list[position]
        return convertView!!
    }
}