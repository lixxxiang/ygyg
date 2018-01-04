package com.example.lixiang.dailypic2_android.presenter

import com.example.lixiang.dailypic2_android.model.entity.HomePageSlide
import com.example.lixiang.dailypic2_android.model.entity.HomePageUnits


/**
 * Created by lixiang on 2017/10/20.
 */

interface HomeContract {
    interface Presenter {
        fun test()
        fun getBanner()
        fun getUnit()
    }

    interface View{
        fun toView()
        fun getBannerSuccess(content: MutableList<HomePageSlide.DataBean>)
        fun getUnitSuccess(content: MutableList<HomePageUnits.DataBean>)
    }
}
