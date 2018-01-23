package com.example.sdkbase.utils;

import android.content.Context;
import android.os.Handler;

import com.example.sdkbase.MyApplication;


/**
 * Created by Administrator on 2018/1/19.
 */

public class AppUtils {

    public static Context getContext(){
        return MyApplication.getmContext();
    }

    public static Handler getHandler(){
        return MyApplication.getHandler();
    }

    public static int getMainThread(){
        return MyApplication.getMainThread();
    }
}
