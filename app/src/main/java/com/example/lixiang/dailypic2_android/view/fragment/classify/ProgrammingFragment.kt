package com.example.lixiang.dailypic2_android.view.fragment.classify


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baidu.mapapi.map.BaiduMapOptions
import com.baidu.mapapi.map.MapStatus
import com.baidu.mapapi.map.SupportMapFragment
import com.baidu.mapapi.model.LatLng

import com.example.lixiang.dailypic2_android.R
import com.example.lixiang.dailypic2_android.view.base.BaseBackFragment
import kotlinx.android.synthetic.main.fragment_programming.*


/**
 * A simple [Fragment] subclass.
 */
class ProgrammingFragment : BaseBackFragment() {
//    private val LTAG = ProgrammingFragment::class.java.simpleName
//    private lateinit var map: SupportMapFragment
    fun newInstance(): ProgrammingFragment {
        val args = Bundle()
        val fragment = ProgrammingFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_programming, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
//        bmapView.onDestroy()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
//        bmapView.onResume()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
//        bmapView.onPause()
//    }

}// Required empty public constructor
