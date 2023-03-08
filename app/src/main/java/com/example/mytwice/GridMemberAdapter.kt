package com.example.mytwice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mytwice.Member
import com.example.mytwice.R

class GridMemberAdapter (val listMember: ArrayList<Member>) :
    RecyclerView.Adapter<GridMemberAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    override fun onCreateViewHolder(ViewGroup: ViewGroup, p1: Int): GridViewHolder {
        val view: View = LayoutInflater.from(ViewGroup.context).inflate(R.layout.item_grid_member, ViewGroup, false)
        return GridViewHolder(view)
    }


    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listMember[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listMember[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listMember.size
    }


    inner class GridViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Member)
    }

}


