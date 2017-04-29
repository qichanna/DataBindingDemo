package com.liqi.databindingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.liqi.databindingdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    EmployeeAdapter mEmployeeAdapter;

    public class Presenter{
        public void onClickAddItem(View view){
            mEmployeeAdapter.add(new Employee("haha","1",false));
        }
        public void onClickRemoveItem(View view){
            mEmployeeAdapter.remove();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Employee em = new Employee("增加item","删除item",false);
        Presenter p = new Presenter();
//        mBinding.setEmployee(em);
        mBinding.setVariable(BR.employee,em);
//        mBinding.setPresenter(p);
        mBinding.setVariable(BR.presenter,p);
//.................................

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mEmployeeAdapter = new EmployeeAdapter(this);
        mBinding.recyclerView.setAdapter(mEmployeeAdapter);
        mEmployeeAdapter.setListener(new EmployeeAdapter.OnItemClickListener() {
            @Override
            public void OnEmployeeClick(Employee employee) {
                Toast.makeText(MainActivity.this,employee.getFirst(),500).show();
            }
        });
        List<Employee> demoList = new ArrayList<>();
        demoList.add(new Employee("Zhai","Mark",false));
        demoList.add(new Employee("Zhai2","Mark2",false));
        demoList.add(new Employee("Zhai3","Mark3",true));
        demoList.add(new Employee("Zhai4","Mark4",false));
        mEmployeeAdapter.addAll(demoList);
    }

    public void intoExpress(View view){
        Intent i = new Intent(this,ExpressionActivity.class);
        startActivity(i);
    }

    public void intoTwoWay(View view){
        Intent i = new Intent(this,TwoWayActivity.class);
        startActivity(i);
    }

    public void intoLambda(View view){
        Intent i = new Intent(this,LambdaActivity.class);
        startActivity(i);
    }

    public void intoAnimation(View view){
        Intent i = new Intent(this,AnimationActivity.class);
        startActivity(i);
    }
}
