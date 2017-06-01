package com.ustc.aaron.learningtest;

import android.app.Application;

/**
 * Created by Aaron on 2017/5/7 0007 下午 10:29.
 */

public class MyApplication extends Application {
    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
//        CrashHandler.getInstance().init(this);

        //AppManager.getInstance(this);
    }
}
