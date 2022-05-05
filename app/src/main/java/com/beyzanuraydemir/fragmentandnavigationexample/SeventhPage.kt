package com.beyzanuraydemir.fragmentandnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.beyzanuraydemir.fragmentandnavigationexample.databinding.FragmentSeventhPageBinding

class SeventhPage : Fragment() {

    private lateinit var fragmentSeventhPageBinding: FragmentSeventhPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSeventhPageBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_seventh_page,container,false)
        // Inflate the layout for this fragment
        return fragmentSeventhPageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentSeventhPageBinding.button7.setOnClickListener {
            findNavController().navigate(R.id.action_seventhPage_to_eigthPage)
        }
    }


}