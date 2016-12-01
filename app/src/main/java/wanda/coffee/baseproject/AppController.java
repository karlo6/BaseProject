package wanda.coffee.baseproject;
// Created by jsonjuliane on 12/1/2016.


import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this); // Install canary leak monitor
    }

}
