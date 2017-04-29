package com.liqi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.liqi.databindingdemo.databinding.ActivityTwoWayBinding;

public class TwoWayActivity extends AppCompatActivity {

    ActivityTwoWayBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_two_way);
        FormModel model = new FormModel("markzhai","123456");
        model.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                //i就是BR.XXX的int值
                Toast.makeText(TwoWayActivity.this,String.valueOf(i),500).show();
            }
        });
        mBinding.setModel(model);
    }
}
