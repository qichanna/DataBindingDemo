package com.liqi.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;

/**
 * Created by liqi on 2017/4/26.
 */

public class Employee extends BaseObservable{
    private String first;
    private String last;
    public ObservableBoolean isFired = new ObservableBoolean();

    public Employee(String first, String last,boolean isfired) {
        this.first = first;
        this.last = last;
        this.isFired.set(isfired);
    }

    @Bindable
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
        notifyPropertyChanged(BR.first);
    }

    @Bindable
    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
        notifyPropertyChanged(BR.last);
    }

    public void setIsFired(ObservableBoolean isFired) {
        this.isFired = isFired;
    }
}
