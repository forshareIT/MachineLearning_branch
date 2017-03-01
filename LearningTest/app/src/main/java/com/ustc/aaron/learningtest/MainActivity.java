package com.ustc.aaron.learningtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ustc.aaron.learningtest.LifeCircleTest.FirstActivity;
import com.ustc.aaron.learningtest.base.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private TextView tv_helloworld;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_helloworld = (TextView) findViewById(R.id.tv_helloworld);
        tv_helloworld.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tv_helloworld:
                startActivity(new Intent(this,FirstActivity.class));
                break;
        }
    }
}
