package com.liqi.databindingdemo;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by liqi on 2017/4/27.
 */

public class BindingViewHolder <T extends ViewDataBinding> extends RecyclerView.ViewHolder{

    private T mBinding;

    public BindingViewHolder(T binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public T getBinding(){
        return mBinding;
    }
}
