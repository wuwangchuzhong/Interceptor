package com.example.modelview.Home.presenter;


import android.content.Intent;

import com.example.modelview.Home.view.View;


/**
 * Created by win764-1 on 2016/12/12.
 */

public interface Presenter {
    void onCreate();

    void onStart();

    void onStop();

    void pause();

    void attachView(View view);

    void attachIncomingIntent(Intent intent);
}
