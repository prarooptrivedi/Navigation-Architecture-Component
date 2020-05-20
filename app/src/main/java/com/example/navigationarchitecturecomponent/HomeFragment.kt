package com.example.navigationarchitecturecomponent


import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationarchitecturecomponent.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
        private lateinit var databinding:FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        databinding=DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        databinding.button.setOnClickListener{
            if (!TextUtils.isEmpty(databinding.editText.text.toString())){


            val bundle= bundleOf("user_input" to databinding.editText.text.toString())
            it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment2,bundle)
            }
            else{
                Toast.makeText(activity,"Please Insert Your Name",Toast.LENGTH_LONG).show()
            }

        }
        return databinding.root
    }


}
