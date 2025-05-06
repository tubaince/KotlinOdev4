package com.example.pupilicaodev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.pupilicaodev3.databinding.FragmentABinding
import com.example.pupilicaodev3.databinding.FragmentBBinding

class BFragment : Fragment() {

    private lateinit var binding:FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentBBinding.inflate(inflater, container, false)

        binding.buttonYgit.setOnClickListener{
            Navigation.findNavController(binding.buttonYgit).navigate(R.id.bden_y_git)
        }

        return binding.root
    }


}