package com.beyzanuraydemir.fragmentandnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.beyzanuraydemir.fragmentandnavigationexample.databinding.FragmentSecondPageBinding


class SecondPage : Fragment() {

   private lateinit var fragmentSecondPageBinding: FragmentSecondPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentSecondPageBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_second_page,container,false)

        return fragmentSecondPageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentSecondPageBinding.button2.setOnClickListener{
            findNavController().navigate(R.id.action_secondPage_to_thirdPage2)
        }
    }


}