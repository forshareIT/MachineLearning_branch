package com.ustc.aaron.learningtest.LifeCircleTest;

import android.os.Bundle;

import com.ustc.aaron.learningtest.R;
import com.ustc.aaron.learningtest.base.BaseActivity;
import com.ustc.aaron.learningtest.utils.LogOut;

public class SecondActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogOut.d("tag---->",TAG+"onCreate");
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogOut.d("tag---->",TAG+"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogOut.d("tag---->",TAG+"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogOut.d("tag---->",TAG+"onResume");
    }
}
