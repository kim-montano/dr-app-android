package com.whitecloak.drapp.dashboard

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.whitecloak.drapp.R
import kotlinx.android.synthetic.main.dashboard_layout.*

/**
 * Created by kimnicolemontano on 2018/03/17.
 */
class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.dashboard_layout)
        product_selection.adapter
    }
}