package com.whitecloak.drapp.camera

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.whitecloak.drapp.R
import com.whitecloak.drapp.utils.notNull
import kotlinx.android.synthetic.main.product_image_layout.view.*

/**
 * Created by kimnicolemontano on 2018/03/17.
 */
const val PRODUCT_IMAGE_PATH_KEY = "PRODUCT_IMAGE_PATH"

class ProductImageOverlayFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.product_image_layout, container, false)
        arguments.notNull {
            Picasso.get().load(it.getString(PRODUCT_IMAGE_PATH_KEY)).into(view.product_image)
        }
        return view
    }

    companion object {

        // Method for creating new instances of the fragment
        fun newInstance(productImagePath: String): ProductImageOverlayFragment {

            // Store the movie data in a Bundle object
            val args = Bundle()
            args.putString("PRODUCT_IMAGE_PATH", productImagePath)

            // Create a new MovieFragment and set the Bundle as the arguments
            // to be retrieved and displayed when the view is created
            val fragment = ProductImageOverlayFragment()
            fragment.arguments = args
            return fragment
        }
    }
}