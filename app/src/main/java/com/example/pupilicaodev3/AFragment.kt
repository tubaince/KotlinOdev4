package com.example.pupilicaodev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.pupilicaodev3.databinding.FragmentABinding

class AFragment : Fragment() {

    private lateinit var binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentABinding.inflate(inflater, container, false)

        binding.buttonBgit.setOnClickListener{
            Navigation.findNavController(binding.buttonBgit).navigate(R.id.adan_bye_git)
        }

        return binding.root
    }


}