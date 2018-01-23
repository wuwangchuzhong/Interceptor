package com.example.modelview.Home.view;


import com.example.modelview.Home.entity.TextBook;

/**
 * Created by Administrator on 2018/1/3.
 */

public interface  TextBookView extends View  {
    void onSuccess(TextBook textBook);
    void onError(String result);
}
