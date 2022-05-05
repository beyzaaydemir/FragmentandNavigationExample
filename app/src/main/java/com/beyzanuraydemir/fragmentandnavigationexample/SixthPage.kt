package com.beyzanuraydemir.fragmentandnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.beyzanuraydemir.fragmentandnavigationexample.databinding.FragmentSixthPageBinding


class SixthPage : Fragment() {

    private lateinit var framentSixthPageBinding: FragmentSixthPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        framentSixthPageBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_sixth_page,container,false)
        // Inflate the layout for this fragment
        return framentSixthPageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        framentSixthPageBinding.button6.setOnClickListener {
            findNavController().navigate(R.id.action_sixthPage_to_seventhPage)
        }
    }


}