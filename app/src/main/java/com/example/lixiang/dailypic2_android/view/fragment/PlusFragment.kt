package com.example.lixiang.dailypic2_android.view.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.lixiang.dailypic2_android.view.base.BaseMainFragment
import com.example.lixiang.dailypic2_android.R


/**
 * A simple [Fragment] subclass.
 */
class PlusFragment : BaseMainFragment() {

    fun newInstance(): PlusFragment {
        val args = Bundle()
        val fragment = PlusFragment()
        fragment.arguments = args
        return fragment
    }
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_plus, container, false)
    }

}// Required empty public constructor
