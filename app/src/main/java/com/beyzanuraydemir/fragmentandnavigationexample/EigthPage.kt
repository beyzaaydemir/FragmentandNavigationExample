package com.beyzanuraydemir.fragmentandnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.beyzanuraydemir.fragmentandnavigationexample.databinding.FragmentEigthPageBinding


class EigthPage : Fragment() {

    private lateinit var fragmentEigthPageBinding: FragmentEigthPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentEigthPageBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_eigth_page,container,false)
        // Inflate the layout for this fragment
        return fragmentEigthPageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentEigthPageBinding.button8.setOnClickListener {
            findNavController().navigate(R.id.action_eigthPage_to_firstPage)
        }
    }


}