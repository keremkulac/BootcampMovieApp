package com.keremkulac.bootcampmovieapp.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.keremkulac.bootcampmovieapp.data.entity.Movie
import com.keremkulac.bootcampmovieapp.databinding.MovieItemBinding

class MovieAdapter(var context: Context,var movieList: List<Movie>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    inner class ViewHolder(var binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MovieItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var movie = movieList[position]
        holder.binding.movieImage.setImageResource(context.resources.getIdentifier(movie.movieImage,"drawable",context.packageName))
        holder.binding.moviePrice.text = "${movie.moviePrice} ₺"
        holder.binding.basket.setOnClickListener {
            Snackbar.make(it,"${movie.movieName} sepete eklendi",Snackbar.LENGTH_SHORT).show()
        }
        holder.binding.movieItem.setOnClickListener{
            val action = HomeFragmentDirections.actionHomeFragmentToMovieDetailFragment(movie)
            Navigation.findNavController(it).navigate(action)

        }

    }
    override fun getItemCount(): Int {
        return movieList.size
    }

}