package com.keremkulac.bootcampmovieapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.keremkulac.bootcampmovieapp.databinding.FragmentMovieDetailBinding


class MovieDetailFragment : Fragment() {
    private lateinit var binding: FragmentMovieDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentMovieDetailBinding.inflate(inflater)
        val arg : MovieDetailFragmentArgs by navArgs()
        val movie = arg.movie
        binding.moviePrice.text = "${movie.moviePrice} ₺"
        binding.movieImageView.setImageResource(requireContext().resources.getIdentifier(movie.movieImage,"drawable",requireContext().packageName))
        return binding.root
    }


}