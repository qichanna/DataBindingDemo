package com.liqi.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.liqi.databindingdemo.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    public class Presenter{
        public void onClickAddItem(View view){
            Toast.makeText(MainActivity.this,"aaa",500).show();
        }
        public void onClickRemoveItem(View view){
            Toast.makeText(MainActivity.this,"bbb",500).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Employee em = new Employee("增加item","删除item");
        Presenter p = new Presenter();
//        mBinding.setEmployee(em);
        mBinding.setVariable(BR.employee,em);
//        mBinding.setPresenter(p);
        mBinding.setVariable(BR.presenter,p);

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
