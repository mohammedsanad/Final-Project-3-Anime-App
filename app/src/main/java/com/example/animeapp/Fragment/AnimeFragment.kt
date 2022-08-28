package com.example.animeapp.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.animeapp.*
import com.example.animeapp.Adapter.AnimeAdapter
import com.example.animeapp.Adapter.OnItemClickListener
import com.example.animeapp.Data.AnimesDataSource
import com.example.animeapp.Data.Anime
import kotlinx.android.synthetic.main.fragment_anime.*



class AnimeFragment : Fragment(), OnItemClickListener {

    private val adapter = AnimeAdapter(AnimesDataSource.createCountriesList())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_anime, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        countries_rc.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = this@AnimeFragment.adapter
        }
        adapter.setOnItemClickListener(this)
    }

    override fun onIteClick(anime: Anime, position: Int) {
        val bundle = bundleOf("anime" to anime)
        findNavController().navigate(
            R.id.action_countriesFragment_to_countryDetailsFragment,bundle)
    }
}