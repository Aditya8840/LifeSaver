package com.codiyapa.lifesaver.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.codiyapa.lifesaver.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

//    private lateinit var nav : NavController

    var isNavigating = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view1 =  inflater.inflate(R.layout.fragment_home, container, false)
        view1.emergency.setOnClickListener {
            if (!isNavigating) {
                Navigation.findNavController(view1)
                    .navigate(R.id.action_homeFragment_to_emergency_Fragment)
            }
        }
        return view1
    }


}