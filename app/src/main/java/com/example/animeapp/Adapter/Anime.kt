package com.example.animeapp.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.animeapp.Data.Anime
import kotlinx.android.synthetic.main.item_anime.view.*

class Anime(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val rootView = itemView.item_country_rootView
    private val name = itemView.item_country_nameTV
    private val city = itemView.item_country_cityTV
    private val imageView = itemView.item_country_imageView

    fun bind(anime: Anime, onItemClickListener: OnItemClickListener) {
        name.text = anime.name
        city.text = anime.city

        Glide.with(itemView).load(anime.image).into(imageView)

        rootView.setOnClickListener {
            onItemClickListener.onIteClick(anime, adapterPosition)

        }
    }

}