package com.beyzanuraydemir.fragmentandnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.beyzanuraydemir.fragmentandnavigationexample.databinding.FragmentFourthPageBinding


class FourthPage : Fragment() {

    private lateinit var fragmentFourthPageBinding: FragmentFourthPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentFourthPageBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_fourth_page,container,false)
        // Inflate the layout for this fragment
        return fragmentFourthPageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentFourthPageBinding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_fourthPage_to_fifthPage)
        }
    }


}