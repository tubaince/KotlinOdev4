package com.example.pupilicaodev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.pupilicaodev3.databinding.FragmentXBinding
import com.example.pupilicaodev3.databinding.FragmentYBinding

class YFragment : Fragment() {
    private lateinit var binding:FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentYBinding.inflate(inflater, container, false)


        val geritusu = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.ydenanasayfaya)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            geritusu
        )

        return binding.root
    }


}