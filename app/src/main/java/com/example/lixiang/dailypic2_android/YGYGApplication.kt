package com.example.lixiang.dailypic2_android

import android.app.Application
import com.baidu.mapapi.SDKInitializer
import com.facebook.drawee.backends.pipeline.Fresco

/**
 * Created by lixiang on 2017/12/18.
 */
class YGYGApplication: Application(){
    override fun onCreate() {
        super.onCreate()
        SDKInitializer.initialize(applicationContext)

        Fresco.initialize(this)
    }
}