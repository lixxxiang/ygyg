package com.example.lixiang.dailypic2_android.view.fragment.classify


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lixiang.dailypic2_android.MainFragment
import com.example.lixiang.dailypic2_android.view.base.BaseMainFragment
import com.example.lixiang.dailypic2_android.R
import kotlinx.android.synthetic.main.fragment_classify.*

/**
 * A simple [Fragment] subclass.
 */
class ClassifyFragment : BaseMainFragment() {

    fun newInstance(): ClassifyFragment {
        val args = Bundle()
        val fragment = ClassifyFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_classify, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        type_1.setOnClickListener {

        }
        type_2.setOnClickListener {

        }
        type_3.setOnClickListener {

        }
        type_4.setOnClickListener {
            (parentFragment as MainFragment).start(ProgrammingFragment().newInstance())
        }
        type_5.setOnClickListener {

        }

    }
}// Required empty public constructor
