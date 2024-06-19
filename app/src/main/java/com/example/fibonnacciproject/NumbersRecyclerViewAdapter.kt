package com.example.fibonnacciproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger


class NumbersRecyclerViewAdapter(private val numbersList: List<BigInteger>) : RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item, parent, false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.integers.text = numbersList[position].toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }
}

class NumbersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var integers: TextView = itemView.findViewById(R.id.tvIntegers)
}