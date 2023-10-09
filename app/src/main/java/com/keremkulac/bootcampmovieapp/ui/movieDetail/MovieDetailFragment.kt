package com.keremkulac.bootcampmovieapp.ui.movieDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.keremkulac.bootcampmovieapp.R
import com.keremkulac.bootcampmovieapp.databinding.FragmentMovieDetailBinding
import com.keremkulac.bootcampmovieapp.ui.MovieDetailFragmentArgs


class MovieDetailFragment : Fragment() {
    private lateinit var binding: FragmentMovieDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movie_detail,container,false)
        val arg : MovieDetailFragmentArgs by navArgs()
        val movie = arg.movie
        binding.movie = movie
        binding.movieImageView.setImageResource(requireContext().resources.getIdentifier(movie.movieImage,"drawable",requireContext().packageName))
        return binding.root
    }


}