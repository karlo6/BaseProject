package wanda.coffee.baseproject;
// Created by jsonjuliane on 12/1/2016.


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import wanda.coffee.baseproject.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User(null, "Juliane");
        mBinding.setUser(user);

    }

}
