package com.example.goodwords

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListVeiwAdapter (val List: MutableList<String>): BaseAdapter(){
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[position]
    }

    override fun getItemId(p0: Int): Long {
        return position.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = convertView
        if(convertView==null){
            convertView=LayoutInflater.from(parent.context).inflate(R.layout.listview_item,parent,false)

        }
        val listviewText=convertView.findViewById<TextView>(R.id.listViewTextArea)
        listviewText!!.text = List[position]
        return convertView
    }
}