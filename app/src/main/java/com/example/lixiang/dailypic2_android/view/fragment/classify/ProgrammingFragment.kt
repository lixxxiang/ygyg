package com.example.lixiang.dailypic2_android.view.fragment.classify


import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout

import com.example.lixiang.dailypic2_android.R
import com.example.lixiang.dailypic2_android.util.ScreenUtils
import com.example.lixiang.dailypic2_android.view.base.BaseBackFragment
import kotlinx.android.synthetic.main.fragment_programming.*
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.sdk25.coroutines.onClick


/**
 * A simple [Fragment] subclass.
 */
class ProgrammingFragment : BaseBackFragment() {

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

    @SuppressLint("ResourceType")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val WIDTH = ScreenUtils.getScreenWidth(context)
        val HEIGHT = ScreenUtils.getScreenHeight(context)
        val topView = RelativeLayout(this.activity)
        topView.id = 1
        topView.backgroundColor = Color.BLACK
        topView.alpha = 0.6F
        val top = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 106 * HEIGHT / 667)
        top.addRule(RelativeLayout.BELOW, R.id.programming_header)
        programming_layout.addView(topView, top)

        val leftView = RelativeLayout(this.activity)
        leftView.id = 2
        leftView.backgroundColor = Color.BLACK
        leftView.alpha = 0.6F
        val left = RelativeLayout.LayoutParams(64 * WIDTH / 375, (375 - 128) * WIDTH / 375)
        left.addRule(RelativeLayout.BELOW, 1)
        programming_layout.addView(leftView, left)

        val rightView = RelativeLayout(this.activity)
        rightView.backgroundColor = Color.BLACK
        rightView.alpha = 0.6F
        val right = RelativeLayout.LayoutParams(64 * WIDTH / 375, (375 - 128) * WIDTH / 375)
        right.addRule(RelativeLayout.BELOW, 1)
        right.addRule(RelativeLayout.ALIGN_PARENT_END)
        programming_layout.addView(rightView, right)

        val bottomView = RelativeLayout(this.activity)
        bottomView.id = 4
        bottomView.backgroundColor = Color.BLACK
        bottomView.alpha = 0.6F
        val bottom = RelativeLayout.LayoutParams(WIDTH, 148 * WIDTH / 375)
        bottom.addRule(RelativeLayout.BELOW, 2)
        programming_layout.addView(bottomView, bottom)

        val cameraView = RelativeLayout(this.activity)
        cameraView.id = 5
        cameraView.backgroundColor = Color.BLACK
        cameraView.alpha = 0.8F
        val cameraViewLayout = RelativeLayout.LayoutParams(WIDTH, RelativeLayout.LayoutParams.MATCH_PARENT)
        cameraViewLayout.addRule(RelativeLayout.BELOW, 4)
        cameraViewLayout.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
        programming_layout.addView(cameraView, cameraViewLayout)

        val camera = ImageView(this.activity)
        camera.onClick {
            bmapView.map.uiSettings.setAllGesturesEnabled(false)

            topView.alpha = 1F
            topView.backgroundColor = Color.parseColor("#333333")
            leftView.alpha = 1F
            leftView.backgroundColor = Color.parseColor("#333333")
            rightView.alpha = 1F
            rightView.backgroundColor = Color.parseColor("#333333")
            bottomView.alpha = 1F
            bottomView.backgroundColor = Color.parseColor("#333333")
            cameraView.alpha = 1F
            cameraView.backgroundColor = Color.parseColor("#333333")
            programming_header.alpha = 1F
            programming_header.backgroundColor = Color.parseColor("#333333")
            camera.visibility = View.INVISIBLE
            search_background.visibility = View.INVISIBLE
            search_hint.visibility = View.INVISIBLE

        }

        programming_back.onClick {
            bmapView.map.uiSettings.setAllGesturesEnabled(true)

            topView.alpha = 0.6F
            topView.backgroundColor = Color.parseColor("#000000")
            leftView.alpha = 0.6F
            leftView.backgroundColor = Color.parseColor("#000000")
            rightView.alpha = 0.6F
            rightView.backgroundColor = Color.parseColor("#000000")
            bottomView.alpha = 0.6F
            bottomView.backgroundColor = Color.parseColor("#000000")
            cameraView.alpha = 0.8F
            cameraView.backgroundColor = Color.parseColor("#000000")
            programming_header.alpha = 0.8F
            programming_header.backgroundColor = Color.parseColor("#000000")
            camera.visibility = View.VISIBLE
            search_background.visibility = View.VISIBLE
            search_hint.visibility = View.VISIBLE
        }
        camera.setImageResource(R.drawable.camera)
        val cameraLayout = RelativeLayout.LayoutParams(46 * WIDTH / 375, 46 * WIDTH / 375)
        cameraLayout.addRule(RelativeLayout.CENTER_VERTICAL, 5)
        cameraLayout.addRule(RelativeLayout.CENTER_HORIZONTAL, 5)
        cameraView.addView(camera, cameraLayout)

    }

}// Required empty public constructor
