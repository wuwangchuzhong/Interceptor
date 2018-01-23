package com.example.mysqltwo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.UserManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.mysqltwo.adapter.MyAdapter;
import com.example.mysqltwo.db.UserDaoManagr;
import com.example.mysqltwo.entity.HomePage;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends Activity {

    private TextView tv_load;
    private RecyclerView recy;
    private MyAdapter adapter;
    private Context mContext;
    //    private List<String> images;
    private List<User> lists;
    private List<User> userLists;
    private UserDaoManagr userDaoManagr;
    private List<HomePage.DataBean.AdsBean> data;
    private List<User> adsBeanLists;//db
    private UserDaoManagr mUserDaoManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mUserDaoManager = new UserDaoManagr();
        recy = (RecyclerView) findViewById(R.id.recy);
        adapter = new MyAdapter();
        recy.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        recy.setAdapter(adapter);

//        initData();
        //单曲数据库
        lists = new ArrayList<>();
        lists.clear();
        lists.addAll(mUserDaoManager.queryAll());
        adapter.setUserData(lists, mContext);

//        setDbData();
    }

    private void setDbData() {
        adsBeanLists.clear();
        adsBeanLists.addAll(userDaoManagr.queryAll());//ok
    }

    private void initData() {
        OkGo.get("http://appapi.yidianchina.com/api/ad/ydAuctionHomePageAd")
                .tag(mContext)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        parseJson(s);
                        Log.i("请求的参数", s.toString());
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        Log.i("请求的参数", e.toString() + "错误");
                    }
                });

    }

    private void parseJson(String json) {
        HomePage homePage = new Gson().fromJson(json, HomePage.class);
        data = homePage.getData().getAds();


        if (data != null && data.size() > 0) {
//            images = new ArrayList<>();
            userLists = new ArrayList<>();
            for (int i = 0; i < data.size(); i++) {
//                images.add(data.get(i).getPicture());
                User user = new User();
                user.setId(null);//这里是拍品的id,暂时传null
                user.setName(data.get(i).getTitle());
                userLists.add(user);
                mUserDaoManager.insert(user);
            }
            Log.i("请求下来的数据", userLists.toString() + userLists.size() + "后面的数据");
//            lists.clear();
//            lists.addAll(mUserDaoManager.queryAll());
//            adapter.setUserData(lists, mContext);
            //广告位数据
//            adapter.setImages(images, data,  mContext);
        }
    }
}
