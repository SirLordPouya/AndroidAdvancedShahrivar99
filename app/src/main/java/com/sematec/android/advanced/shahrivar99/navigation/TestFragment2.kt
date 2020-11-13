package com.sematec.android.advanced.shahrivar99.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.sematec.android.advanced.shahrivar99.R
import kotlinx.android.synthetic.main.fragment_test2.*


class TestFragment2 : Fragment() {

    val args: TestFragment2Args by navArgs()  //delegation

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        val name = arguments?.getString("name")
//        val age = arguments?.getInt("age")
        //////////////////////////

        val name = args.name
        val age = args.age
        txtData.text = name + age


        btnFragment3.setOnClickListener {
            val direction = TestFragment2Directions.actionTestFragment2ToTestFragment3()
            findNavController().navigate(direction)
        }
    }
}