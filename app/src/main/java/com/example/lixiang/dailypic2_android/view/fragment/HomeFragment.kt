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
import com.example.lixiang.dailypic2_android.di.components.DaggerHomeComponent
import com.example.lixiang.dailypic2_android.di.modules.HomeModule
import com.example.lixiang.dailypic2_android.model.entity.HomePageSlide
import com.example.lixiang.dailypic2_android.model.entity.HomePageUnits
import com.example.lixiang.dailypic2_android.presenter.HomeContract
import com.example.lixiang.dailypic2_android.presenter.HomePresenter
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.ArrayList
import javax.inject.Inject


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : BaseMainFragment(), HomeContract.View {

    private var bannerContent : MutableList<HomePageSlide.DataBean> = mutableListOf()
    private var unitContent : MutableList<HomePageUnits.DataBean> = mutableListOf()

    var mAdapter = HomeAdapter(bannerContent as ArrayList<HomePageSlide.DataBean>?, unitContent as ArrayList<HomePageUnits.DataBean>?)
//        var mAdapter = HomeAdapter(bannerContent as ArrayList<HomePageSlide.DataBean>?)

    @Inject lateinit var presenter: HomePresenter

    override fun getUnitSuccess(content: MutableList<HomePageUnits.DataBean>) {
        unitContent = content
        println("fuck it " + unitContent[0].description)
        presenter.getBanner()
//        mAdapter = HomeAdapter(bannerContent as ArrayList<HomePageSlide.DataBean>?, unitContent as ArrayList<HomePageUnits.DataBean>?)
//        recyclerView_home.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
//        recyclerView_home.adapter = mAdapter
    }

    override fun getBannerSuccess(content: MutableList<HomePageSlide.DataBean>) {
        bannerContent = content
        mAdapter = HomeAdapter(bannerContent as ArrayList<HomePageSlide.DataBean>?, unitContent as ArrayList<HomePageUnits.DataBean>?)

//        mAdapter = HomeAdapter(bannerContent as ArrayList<HomePageSlide.DataBean>?)
        recyclerView_home.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        recyclerView_home.adapter = mAdapter
    }

    override fun toView() {
    }


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

        DaggerHomeComponent.builder().homeModule(HomeModule(this))
                .build()
                .inject(this)


        presenter.getUnit()


    }
}
