package com.example.animeapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.animeapp.Data.Anime
import com.example.animeapp.R

class AnimeAdapter(private val countriesList: List<Anime>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var onItemClickListener: OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return Anime(
            LayoutInflater.from(parent.context).inflate(R.layout.item_anime, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as com.example.animeapp.Adapter.Anime).bind(anime = countriesList[position],onItemClickListener)

    }

    override fun getItemCount(): Int = countriesList.size

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener){
        this.onItemClickListener = onItemClickListener
    }
}