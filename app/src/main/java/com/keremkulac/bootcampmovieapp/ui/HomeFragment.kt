package com.keremkulac.bootcampmovieapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.keremkulac.bootcampmovieapp.data.entity.Movie
import com.keremkulac.bootcampmovieapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentHomeBinding.inflate(inflater)
        binding.homeToolbar.title = "Filmler"
        binding.movieRecyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        val adapter = MovieAdapter(requireContext(), movieList())
        binding.movieRecyclerView.adapter = adapter
        return binding.root
    }

    private fun movieList() : ArrayList<Movie>{
        var list = ArrayList<Movie>()
        val movie1 = Movie(0,"Django","django",24)
        val movie2 = Movie(1,"Inception","inception",32)
        val movie3 = Movie(2,"Interstellar","interstellar",16)
        val movie4 = Movie(3,"Anadoluda","anadoluda",52)
        val movie5 = Movie(4,"The Pianist","thepianist",44)
        val movie6 = Movie(5,"The Hateful Eight","thehatefuleight",38)
        list.add(movie1)
        list.add(movie2)
        list.add(movie3)
        list.add(movie4)
        list.add(movie5)
        list.add(movie6)
        return list
    }



}