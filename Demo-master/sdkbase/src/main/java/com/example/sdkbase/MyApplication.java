package com.example.sdkbase;

import android.app.Application;
import android.content.Context;
import android.os.Handler;


/**
 * Created by Administrator on 2018/1/19.
 */

public class MyApplication extends Application {

    protected static Context mContext;
    protected static Handler handler;
    protected static int mainThread;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
        handler=new Handler();
        mainThread = android.os.Process.myTid();
    }

    public static Context getmContext(){
        return mContext;
    }
    public static Handler getHandler(){
        return handler;
    }
    public static int getMainThread(){
        return mainThread;
    }
}
