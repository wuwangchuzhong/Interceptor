package com.example.modelview.Home.manager;

import android.content.Context;

import com.example.modelview.Home.RetrofitHelper;
import com.example.modelview.Home.RetrofitService;
import com.example.modelview.Home.entity.TextBook;

import rx.Observable;

/**
 * Created by Administrator on 2018/1/9.
 */

public class DataManager {

    private RetrofitService retrofitService;

    public DataManager(Context context) {
        retrofitService= RetrofitHelper.getInstance(context).getServer();
    }

    public Observable<TextBook> getBanner(){
      return retrofitService.getBanner();
    }

}
