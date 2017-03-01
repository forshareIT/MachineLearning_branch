package com.ustc.aaron.learningtest.utils;

import android.util.Log;

public class LogOut {
    private static boolean LogSwitch = true;                 //log开关， true打开log，false关闭log
    
    public static final void v(String tag, String content) {
        if (LogSwitch) {
            Log.v(tag, content);
        }
    }

    public static final void d(String tag, String content) {
        if (LogSwitch) {
            Log.d(tag, content);
        }
    }

    public static final void i(String tag, String content) {
        if (LogSwitch)
            Log.i(tag, content);
    }

    public static final void w(String tag, String content) {
        if (LogSwitch) {
            Log.w(tag, content);
        }
    }


    public static final void e(String tag, String content) {
        if (LogSwitch)
            Log.e(tag, content);
    }

    public static void trace(String tag, String msg) {
        trace(tag, msg, new Throwable());
    }

    public static void trace(String tag, Throwable e) {
        trace(tag, null, e);
    }

    public static void trace(String tag, String msg, Throwable e) {
        if(LogSwitch)
            Log.e(tag,msg,e);
    }
}
