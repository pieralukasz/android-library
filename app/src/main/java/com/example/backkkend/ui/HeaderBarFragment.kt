package com.example.backkkend.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.backkkend.R
import com.example.backkkend.databinding.ActivityMainBinding
import com.example.backkkend.databinding.FragmentHeadbarBinding

class HeaderBarFragment: Fragment() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentHeadbarBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_headbar, container, false)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

}