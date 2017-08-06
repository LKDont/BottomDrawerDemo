package com.lkdont.bottomdrawerdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.test_act.*

/**
 * 测试页面
 *
 * Created by kidonliang on 2017/8/1.
 */
class TestAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_act)

        bottomDrawer.setScrollableViewId(R.id.recyclerView2)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = ItemAdapter(this)

        val layoutManager2 = LinearLayoutManager(this)
        layoutManager2.orientation = LinearLayoutManager.VERTICAL
        recyclerView2.layoutManager = layoutManager2
        recyclerView2.adapter = ItemAdapter(this)
    }

    fun onToggleClick(v: View) {
        if (drawerContainer.isOpened()) {
            drawerContainer.closeDrawer()
        } else {
            drawerContainer.openDrawer()
        }
    }
}