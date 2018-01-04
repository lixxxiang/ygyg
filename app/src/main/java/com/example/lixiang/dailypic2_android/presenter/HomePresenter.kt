@file:Suppress("UNREACHABLE_CODE")

package com.example.lixiang.dailypic2_android.presenter


import retrofit2.Retrofit
import javax.inject.Inject
import com.example.lixiang.dailypic2_android.model.api.ApiService
import com.example.lixiang.dailypic2_android.model.entity.HomePageSlide
import com.example.lixiang.dailypic2_android.model.entity.HomePageUnits
import com.example.lixiang.dailypic2_android.util.NetUtils
import retrofit2.Call


/**
* Created by lixiang on 2017/10/20.
*/

class HomePresenter @Inject
constructor(private val view: HomeContract.View) : HomeContract.Presenter {


    internal var retrofit: Retrofit? = null
    internal var apiService: ApiService? = null

    override fun getUnit() {
        retrofit = NetUtils.getRetrofit()
        apiService = retrofit!!.create(ApiService::class.java)
        val call = apiService!!.HomePageUnits()
        call.enqueue(object : retrofit2.Callback<HomePageUnits> {

            override fun onResponse(call: retrofit2.Call<HomePageUnits>, response: retrofit2.Response<HomePageUnits>) {
                if (response.body() != null) {
                    println("-----")
                    view.getUnitSuccess(response.body().data)
                } else {

                }

            }

            override fun onFailure(call: retrofit2.Call<HomePageUnits>, throwable: Throwable) {}
        })
    }

    override fun getBanner() {
        retrofit = NetUtils.getRetrofit()
        apiService = retrofit!!.create(ApiService::class.java)
        val call = apiService!!.HomePageSlide()
        call.enqueue(object : retrofit2.Callback<HomePageSlide> {

            override fun onResponse(call: retrofit2.Call<HomePageSlide>, response: retrofit2.Response<HomePageSlide>) {
                if (response.body() != null) {
                    view.getBannerSuccess(response.body().data)
                } else {

                }

            }

            override fun onFailure(call: retrofit2.Call<HomePageSlide>, throwable: Throwable) {}
        })
    }

    override fun test() {
        println("ddd")
    }
}
