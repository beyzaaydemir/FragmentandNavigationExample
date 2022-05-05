package com.beyzanuraydemir.fragmentandnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.beyzanuraydemir.fragmentandnavigationexample.databinding.FragmentThirdPageBinding


class ThirdPage : Fragment() {

    private lateinit var fragmentThirdPageBinding: FragmentThirdPageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentThirdPageBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_third_page,container,false)
        // Inflate the layout for this fragment
        return fragmentThirdPageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentThirdPageBinding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_thirdPage2_to_fourthPage)
        }
    }


}