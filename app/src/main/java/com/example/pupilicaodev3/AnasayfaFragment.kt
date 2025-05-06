package com.example.pupilicaodev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.pupilicaodev3.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding:FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentAnasayfaBinding.inflate(inflater, container,false)

        binding.buttonAgit.setOnClickListener{
            Navigation.findNavController(binding.buttonAgit).navigate(R.id.anasayfadan_a_yagit)
        }
        binding.buttonXgit.setOnClickListener{
            Navigation.findNavController(binding.buttonXgit).navigate(R.id.anasayfadan_xe_git)
        }


        return binding.root
    }


}