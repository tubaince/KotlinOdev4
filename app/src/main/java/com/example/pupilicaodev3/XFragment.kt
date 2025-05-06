package com.example.pupilicaodev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.pupilicaodev3.databinding.FragmentBBinding
import com.example.pupilicaodev3.databinding.FragmentXBinding


class XFragment : Fragment() {
    private lateinit var binding: FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentXBinding.inflate(inflater, container, false)
        binding.buttonXdenYyegit.setOnClickListener{
            Navigation.findNavController(binding.buttonXdenYyegit).navigate(R.id.xden_ye_git)
        }
        return binding.root
    }


}