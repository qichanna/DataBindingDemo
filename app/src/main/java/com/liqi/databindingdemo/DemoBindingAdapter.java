package com.liqi.databindingdemo;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by liqi on 2017/4/28.
 */

public class DemoBindingAdapter {

    @BindingAdapter({"imageUrl","placeholder"})
    public static void loadImageFromUrl(ImageView view, String url, Drawable drawable){
        Log.e("liqi7", "loadImageFromUrl: "+url);
        Toast.makeText(view.getContext(),"showshowshow",500).show();
        Glide.with(view.getContext()).load(url).placeholder(drawable).into(view);
    }
}
