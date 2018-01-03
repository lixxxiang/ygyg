package com.example.lixiang.dailypic2_android

import android.graphics.Color
import android.os.Bundle
import com.baidu.mapapi.SDKInitializer
import com.githang.statusbar.StatusBarCompat
import me.yokeyword.fragmentation.SupportActivity


class MainActivity : SupportActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StatusBarCompat.setStatusBarColor(this, Color.parseColor("#FFFFFF"))
        if (findFragment(MainFragment::class.java) == null) {
            loadRootFragment(R.id.fl_container, MainFragment().newInstance())
        }
    }
}
