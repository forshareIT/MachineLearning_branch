package com.ustc.aaron.learningtest.LifeCircleTest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ustc.aaron.learningtest.R;
import com.ustc.aaron.learningtest.base.BaseActivityOld;
import com.ustc.aaron.learningtest.utils.LogOut;

public class FirstActivityOld extends BaseActivityOld implements View.OnClickListener{

    private TextView tv_first;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogOut.d("tag---->",TAG+"onCreate");
        setContentView(R.layout.activity_first);
        tv_first = (TextView) findViewById(R.id.tv_first);
        tv_first.setOnClickListener(this);
        Intent intent = new Intent();
		
		System.out.print("h888");
		
//        intent.resolveActivity(getPackageManager());
        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tv_first:
                startActivity(new Intent(this,SecondActivityOld.class));
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogOut.d("tag---->",TAG+"onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogOut.d("tag---->",TAG+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogOut.d("tag---->",TAG+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogOut.d("tag---->",TAG+"onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        LogOut.d("tag---->",TAG+"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogOut.d("tag---->",TAG+"ondestory");
    }
}
