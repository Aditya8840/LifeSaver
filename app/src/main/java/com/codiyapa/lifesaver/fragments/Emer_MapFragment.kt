package com.codiyapa.lifesaver.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.codiyapa.lifesaver.R
import kotlinx.android.synthetic.main.fragment_emer__map.*


class Emer_MapFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_emer__map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        imageView6.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_emer_MapFragment_to_emer_paymentFragment)
        }
    }
}