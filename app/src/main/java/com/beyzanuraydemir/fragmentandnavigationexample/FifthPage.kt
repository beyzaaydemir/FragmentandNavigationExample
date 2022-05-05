package com.beyzanuraydemir.fragmentandnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.beyzanuraydemir.fragmentandnavigationexample.databinding.FragmentFifthPageBinding


class FifthPage : Fragment() {

    private lateinit var fragmentFifthPageBinding: FragmentFifthPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentFifthPageBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_fifth_page,container,false)
        // Inflate the layout for this fragment
        return fragmentFifthPageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentFifthPageBinding.button5.setOnClickListener {
            findNavController().navigate(R.id.action_fifthPage_to_sixthPage)
        }
    }


}