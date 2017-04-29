package com.liqi.databindingdemo;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by liqi on 2017/4/28.
 */

public class DemoBindingAdapter {

    @BindingAdapter({"imageUrl","placeholder"})
    public static void loadImageFromUrl(ImageView view, String url, Drawable drawable){
        Log.e("liqi7", "loadImageFromUrl: 11111111"+url);
        Toast.makeText(view.getContext(),"showshowshow",500).show();
//        Glide.with(view.getContext()).load(url).placeholder(drawable).into(view);
        Glide.with(view.getContext()).load(url)
                .asBitmap()
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.NONE)//禁用磁盘缓存
                .skipMemoryCache(true)//跳过内存缓存
                .placeholder(drawable)
                .into(view);
    }

    @BindingAdapter({"imageUrl"})
    public static void loadImageFromUrl(ImageView view, String url){
        Log.e("liqi7", "loadImageFromUrl11111: "+url);
        Toast.makeText(view.getContext(),"showshowshow111111",500).show();
    }
}
