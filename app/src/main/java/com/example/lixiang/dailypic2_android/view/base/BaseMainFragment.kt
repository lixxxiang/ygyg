package com.example.lixiang.dailypic2_android.view.base


import android.support.v4.app.Fragment
import android.widget.Toast
import me.yokeyword.fragmentation.SupportFragment


/**
 * A simple [Fragment] subclass.
 */
abstract class BaseMainFragment : SupportFragment() {
    private var TOUCH_TIME: Long = 0

    /**
     * 处理回退事件
     *
     * @return
     */
    override fun onBackPressedSupport(): Boolean {
        if (System.currentTimeMillis() - TOUCH_TIME < WAIT_TIME) {
            _mActivity.finish()
        } else {
            TOUCH_TIME = System.currentTimeMillis()
            Toast.makeText(_mActivity, "再按一次退出", Toast.LENGTH_SHORT).show()
        }
        return true
    }

    companion object {
        // 再点一次退出程序时间设置
        private val WAIT_TIME = 2000L
    }
}
