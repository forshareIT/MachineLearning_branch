package com.ustc.aaron.learningtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ustc.aaron.learningtest.activity.OcrActivity;
import com.ustc.aaron.learningtest.base.BaseActivityOld;

public class MainActivityOld extends BaseActivityOld implements View.OnClickListener{

    private TextView tv_helloworld;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_helloworld = (Button) findViewById(R.id.tv_helloOCR);
        tv_helloworld.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tv_helloOCR:
                startActivity(new Intent(this,OcrActivity.class));
                break;
        }
    }
}
