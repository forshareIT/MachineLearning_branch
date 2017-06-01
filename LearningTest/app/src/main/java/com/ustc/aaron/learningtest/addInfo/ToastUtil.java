package com.ustc.aaron.learningtest.addInfo;

import android.widget.Toast;

import com.ustc.aaron.learningtest.MyApplication;


/**
 * Created by l4656_000 on 2015/12/27.
 */
public class ToastUtil {
    public static void show(String msg){
        Toast.makeText(MyApplication.getInstance(), msg, Toast.LENGTH_SHORT).show();
    }
    public static void show(int rid){
        Toast.makeText(MyApplication.getInstance(), rid, Toast.LENGTH_SHORT).show();
    }
    public static void showLong(int rid){
        Toast.makeText(MyApplication.getInstance(), rid, Toast.LENGTH_LONG).show();
    }
}
