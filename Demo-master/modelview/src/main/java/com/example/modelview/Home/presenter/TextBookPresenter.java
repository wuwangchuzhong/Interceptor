package com.example.modelview.Home.presenter;

import android.bluetooth.BluetoothClass;
import android.content.Context;
import android.content.Intent;
import android.util.AndroidException;

import com.example.modelview.Home.entity.TextBook;
import com.example.modelview.Home.manager.DataManager;
import com.example.modelview.Home.view.TextBookView;
import com.example.modelview.Home.view.View;

import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Administrator on 2018/1/9.
 */

public class TextBookPresenter implements Presenter {

    private DataManager dataManager;
    private Context mContext;
    private CompositeSubscription mCompositeSubscription;
    private TextBookView textBookView;
    private TextBook mTextBook;

    public TextBookPresenter(Context context) {
        this.mContext = context;
    }

    @Override
    public void onCreate() {
        dataManager=new DataManager(mContext);
        mCompositeSubscription=new CompositeSubscription();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions()){
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
        textBookView= (TextBookView) view;
    }

    @Override
    public void attachIncomingIntent(Intent intent) {

    }

    public void getBanner(){
        mCompositeSubscription.add(dataManager.getBanner()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TextBook>(){

                    @Override
                    public void onCompleted() {
                       if (mTextBook!=null){
                           textBookView.onSuccess(mTextBook);
                       }
                    }

                    @Override
                    public void onError(Throwable e) {
                        textBookView.onError(e.toString());
                    }

                    @Override
                    public void onNext(TextBook textBook) {
                        mTextBook=textBook;
                    }
                })
        );
    }
}
