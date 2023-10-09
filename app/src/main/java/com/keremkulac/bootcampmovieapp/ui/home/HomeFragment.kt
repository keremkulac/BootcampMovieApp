package com.keremkulac.bootcampmovieapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.keremkulac.bootcampmovieapp.R
import com.keremkulac.bootcampmovieapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val viewModel by viewModels<HomeViewModel>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home,container,false)
        binding.toolbarTitle = "Filmler"
        viewModel.moviesList.observe(viewLifecycleOwner){
            val adapter = MovieAdapter(requireContext(),it)
            binding.adapter = adapter
        }

        return binding.root
    }




}