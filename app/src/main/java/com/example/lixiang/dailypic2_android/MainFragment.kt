package com.example.lixiang.dailypic2_android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lixiang.dailypic2_android.view.fragment.*
import com.example.lixiang.dailypic2_android.view.fragment.classify.ClassifyFragment

import kotlinx.android.synthetic.main.bottom_navigation_bar.*
import me.yokeyword.eventbusactivityscope.EventBusActivityScope
import me.yokeyword.fragmentation.SupportFragment

class MainFragment : SupportFragment() {
    val FIRST = 0
    val SECOND = 1
    val THIRD = 2
    val FOURTH = 3
    val FIFTH = 4
    private val mFragments = arrayOfNulls<SupportFragment>(5)
    var mCurrentPosition = 0
    fun newInstance(): MainFragment {
        val args = Bundle()
        val fragment = MainFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_main, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
        val firstFragment = findChildFragment(HomeFragment::class.java)
        if (firstFragment == null) {
            mFragments[FIRST] = HomeFragment().newInstance()
            mFragments[SECOND] = ClassifyFragment().newInstance()
            mFragments[THIRD] = PlusFragment().newInstance()
            mFragments[FOURTH] = SpecialFragment().newInstance()
            mFragments[FIFTH] = MeFragment().newInstance()


            loadMultipleRootFragment(R.id.fl_tab_container, FIRST,
                    mFragments[FIRST],
                    mFragments[SECOND],
                    mFragments[THIRD],
                    mFragments[FOURTH],
                    mFragments[FIFTH] )

        } else {
            mFragments[FIRST] = firstFragment
            mFragments[SECOND] = findChildFragment(ClassifyFragment::class.java)
            mFragments[THIRD] = findChildFragment(PlusFragment::class.java)
            mFragments[FOURTH] = findChildFragment(SpecialFragment::class.java)
            mFragments[FIFTH] = findChildFragment(MeFragment::class.java)

        }
    }

    private fun initView() {
        home.setOnClickListener {
            println("0")
            if(mCurrentPosition == 0)
                EventBusActivityScope.getDefault(_mActivity).post(0)
            showHideFragment(mFragments[0], mFragments[mCurrentPosition])
            mCurrentPosition = 0

        }

        classify.setOnClickListener {
            println("1")
            if(mCurrentPosition == 1)
                EventBusActivityScope.getDefault(_mActivity).post(1)
            showHideFragment(mFragments[1], mFragments[mCurrentPosition])
            mCurrentPosition = 1
        }

        plus.setOnClickListener {
            println("2")
            if(mCurrentPosition == 2)
                EventBusActivityScope.getDefault(_mActivity).post(2)
            showHideFragment(mFragments[2], mFragments[mCurrentPosition])
            mCurrentPosition = 2
        }

        special.setOnClickListener {
            println("3")
            if(mCurrentPosition == 3)
                EventBusActivityScope.getDefault(_mActivity).post(3)
            showHideFragment(mFragments[3], mFragments[mCurrentPosition])
            mCurrentPosition = 3
        }

        me.setOnClickListener {
            println("4")
            if(mCurrentPosition == 4)
                EventBusActivityScope.getDefault(_mActivity).post(4)
            showHideFragment(mFragments[4], mFragments[mCurrentPosition])
            mCurrentPosition = 4
        }

    }

    fun startBrotherFragment(targetFragment: SupportFragment) {
        start(targetFragment)
    }
}
