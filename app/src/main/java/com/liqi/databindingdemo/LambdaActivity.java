package com.liqi.databindingdemo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.liqi.databindingdemo.databinding.ActivityLambdaBinding;

public class LambdaActivity extends AppCompatActivity {

    private ActivityLambdaBinding mBinding;

    public class Presenter{
        public void onEmployeeClick(Employee employee){
            Toast.makeText(LambdaActivity.this,"onEmployeeClick",500).show();
        }

        public void onEmployeeLongClick(Employee employee, Context context){
            Toast.makeText(LambdaActivity.this,"onEmployeeLongClick",500).show();
        }

        public void onFocusChange(Employee employee){
            Toast.makeText(LambdaActivity.this,"onFocusChange",500).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_lambda);
        mBinding.setEmployee(new Employee("aaa","bbb",true));
        mBinding.setPresenter(new Presenter());
    }
}
