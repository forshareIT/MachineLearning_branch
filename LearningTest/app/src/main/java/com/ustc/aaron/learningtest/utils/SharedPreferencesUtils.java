package com.ustc.aaron.learningtest.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesUtils {
    private static SharedPreferences sp;

    public static void putInt(Context context, String key, int value) {
        if (sp == null) {
            sp = context.getSharedPreferences("UniitownSeller_Info", Context.MODE_PRIVATE);
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.putInt(key, value).commit();
    }

    public static int getInt(Context context, String key, int defaultValue) {
        if (sp == null) {
            sp = context.getSharedPreferences("UniitownSeller_Info", Context.MODE_PRIVATE);
        }
        return sp.getInt(key, defaultValue);
    }

    public static void putBoolean(Context context, String key, Boolean value) {
        if (sp == null) {
            sp = context.getSharedPreferences("UniitownSeller_Info", Context.MODE_PRIVATE);
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(key, value).commit();
    }

    public static Boolean getBoolean(Context context, String key, Boolean defaultValue) {
        if (sp == null) {
            sp = context.getSharedPreferences("UniitownSeller_Info", Context.MODE_PRIVATE);
        }
        return sp.getBoolean(key, defaultValue);
    }

    public static void putString(Context context, String key, String value) {
        if (sp == null) {
            sp = context.getSharedPreferences("UniitownSeller_Info", Context.MODE_PRIVATE);
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key, value).commit();
    }

    public static String getString(Context context, String key, String defaultValue) {
        if (sp == null) {
            sp = context.getSharedPreferences("UniitownSeller_Info", Context.MODE_PRIVATE);
        }
        return sp.getString(key, defaultValue);
    }

    public static void clear(Context context) {
        if (sp == null) {
            sp = context.getSharedPreferences("UniitownSeller_Info", Context.MODE_PRIVATE);
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.clear();
        edit.commit();
    }

}
