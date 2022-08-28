package com.example.animeapp.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_anime_details.*
import android.content.Intent
import android.net.Uri
import com.example.animeapp.Data.Anime
import com.example.animeapp.R

class AnimeDetailsFragment : Fragment() {
    private lateinit var anime: Anime

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        anime = arguments?.getParcelable("anime")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_anime_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(this).load(anime.image).into(imageView2)
        textView2.text = anime.name
        textView3.text = anime.hot


        loction.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            val f = anime.name
            openURL.data = Uri.parse(anime.uri)
            startActivity(openURL)
        }

        imageView2.setOnClickListener {
            findNavController().popBackStack()
        }

    }
}