package com.example.lixiang.dailypic2_android.view.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.lixiang.dailypic2_android.view.base.BaseMainFragment
import com.example.lixiang.dailypic2_android.adapter.HomeAdapter
import com.example.lixiang.dailypic2_android.R
import kotlinx.android.synthetic.main.fragment_home.*


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : BaseMainFragment() {

    var bannerContent : MutableList<String> = mutableListOf()

    var mAdapter = HomeAdapter(bannerContent)

    fun newInstance(): HomeFragment {
        val args = Bundle()
        val fragment = HomeFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        bannerContent.add("http://202.111.178.10:28085/upload/image/201711151645000412863_thumb.jpg")
        bannerContent.add("http://202.111.178.10:28085/upload/image/201711151645000412863_thumb.jpg")
        bannerContent.add("http://202.111.178.10:28085/upload/image/201711151645000412863_thumb.jpg")
        bannerContent.add("http://202.111.178.10:28085/upload/image/201711151645000412863_thumb.jpg")
        bannerContent.add("http://202.111.178.10:28085/upload/image/201711151645000412863_thumb.jpg")

        mAdapter = HomeAdapter(bannerContent)
        recyclerView_home.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        recyclerView_home.adapter = mAdapter
    }
}
