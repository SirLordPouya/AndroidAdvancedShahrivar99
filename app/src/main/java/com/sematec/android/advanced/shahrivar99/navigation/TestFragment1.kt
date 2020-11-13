package com.sematec.android.advanced.shahrivar99.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sematec.android.advanced.shahrivar99.R
import kotlinx.android.synthetic.main.fragment_test1.*


class TestFragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_test1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnFragment2.setOnClickListener {

            val direction = TestFragment1Directions.actionTestFragment1ToTestFragment2(30)
            ///////////////////////////////
//            val bundle = Bundle()
//            bundle.putString("name", "Pouya")
//            bundle.putInt("age", 30)
            ///////////////////////////////
            findNavController().navigate(direction)
        }
    }
}