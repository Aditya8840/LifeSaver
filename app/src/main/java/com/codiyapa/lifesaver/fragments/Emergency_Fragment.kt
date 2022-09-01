package com.codiyapa.lifesaver.fragments

import android.R.attr
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import com.codiyapa.lifesaver.R
import kotlinx.android.synthetic.main.fragment_emergency_.*


class Emergency_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_emergency_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        imageView4.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_emergency_Fragment_to_nearbyhospital_Fragment)
        }
//        view.isFocusableInTouchMode = true
//        view.requestFocus()
//        view.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
//            if (keyCode == KeyEvent.KEYCODE_BACK && event.action === KeyEvent.ACTION_UP) {
//                requireFragmentManager().popBackStack()
//                return@OnKeyListener true
//            }
//            false
//        })
    }
}