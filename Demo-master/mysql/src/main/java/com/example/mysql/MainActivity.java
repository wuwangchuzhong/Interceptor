package com.example.mysql;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.mysql.adapter.MyAdapter;
import com.example.mysql.entity.HomePage;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        recy = (RecyclerView) findViewById(R.id.recy);
        adapter = new MyAdapter();
        recy.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recy.setAdapter(adapter);
        initData();
    }

    private void initData() {
        OkGo.post("http://59.110.112.73:8082/api/ad/ydAuctionHomePageAd")
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        parseJson(s);
                        Log.i("请求的参数",s.toString());
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        Log.i("请求的参数",e.toString()+"错误");
                    }
                });

    }
    private List<String> images;
    private void parseJson(String json) {
        HomePage homePage = new Gson().fromJson(json, HomePage.class);
        List<HomePage.DataBean.AdsBean> data = homePage.getData().getAds();

        if (data != null && data.size() > 0) {
            images = new ArrayList<>();
            for (int i = 0; i < data.size(); i++) {
                images.add(data.get(i).getPicture());
            }
            //广告位数据
            adapter.setImages(images, data,  mContext);
        }
    }
}
