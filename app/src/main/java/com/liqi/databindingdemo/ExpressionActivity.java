package com.liqi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liqi.databindingdemo.databinding.ActivityExpressionBinding;

public class ExpressionActivity extends AppCompatActivity {

    private ActivityExpressionBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Employee employee = new Employee("https://img.alicdn.com/tps/TB1uyhoMpXXXXcLXVXXXXXXXXXX-476-538.jpg_240x5000q50.jpg_.webp","ss",false);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_expression);
        mBinding.setEmployee(employee);
    }
}
