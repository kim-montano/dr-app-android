package com.whitecloak.drapp.dashboard

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.whitecloak.drapp.camera.ProductImageOverlayFragment

/**
 * Created by kimnicolemontano on 2018/03/18.
 */
class ProductSelectionPagerAdapter(fragmentManager: FragmentManager, private val products: Array<String>) :
        FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return ProductImageOverlayFragment.newInstance(products[position])
    }

    override fun getCount(): Int {
        return products.size
    }
}