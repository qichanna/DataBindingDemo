package com.liqi.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by liqi on 2017/4/29.
 */

public class FormModel extends BaseObservable {

    private String mName;
    private String mPassword;

    public FormModel(String mName, String mPassword) {
        this.mName = mName;
        this.mPassword = mPassword;
    }

    @Bindable
    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String mPassword) {
        this.mPassword = mPassword;
        notifyPropertyChanged(BR.password);
    }
}
