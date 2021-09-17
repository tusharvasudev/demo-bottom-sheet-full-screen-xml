package com.demo.bottomsheetfullscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    private lateinit var showButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        showButton = view.findViewById(R.id.showButton)


        showButton.setOnClickListener {
            //Toast.makeText(requireContext(), "Clicked", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_homeFragment_to_bottomSheetFragment)
        }

        return view

    }



}