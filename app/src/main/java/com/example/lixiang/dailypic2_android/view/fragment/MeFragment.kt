package com.example.lixiang.dailypic2_android.view.fragment


import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.lixiang.dailypic2_android.view.base.BaseMainFragment
import com.example.lixiang.dailypic2_android.R
import android.os.Build
import com.example.lixiang.dailypic2_android.adapter.MeListviewAdapter


/**
 * A simple [Fragment] subclass.
 */
class MeFragment : BaseMainFragment() {



    var contentName: MutableList<String> = mutableListOf("我的订单", "优惠券", "发票管理", "设置", "客服", "意见反馈")
    var adapter = MeListviewAdapter(activity, contentName)
    fun newInstance(): MeFragment {
        val args = Bundle()
        val fragment = MeFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_me, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}
