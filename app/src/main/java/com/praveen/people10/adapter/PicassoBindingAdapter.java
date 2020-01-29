package com.praveen.people10.adapter;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;
import com.praveen.people10.R;

public class PicassoBindingAdapter {

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView imageView, String imageHref) {

        Picasso.get().load(imageHref)
                .placeholder(R.drawable.ic_default_image)
                .error(R.drawable.ic_error_loading)
                .into(imageView);
    }
}
