package com.example.navigationarchitecturecomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigationarchitecturecomponent.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {
        private lateinit var dataBinding:FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        dataBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)
       var input=requireArguments().getString("user_input")
        dataBinding.textName.text=input.toString()
        return  dataBinding.root
    }


}
