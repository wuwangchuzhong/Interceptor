package com.example.interceptordemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.interceptordemo.Bean.ZHIHuBean;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends Activity {

    private TextView tv_quest;
    private TextView tv_requst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_quest=findViewById(R.id.tv_quest);
        tv_requst=findViewById(R.id.tv_requst);

        tv_quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initData();
            }
        });

    }

    private void initData() {
        String url="http://news-at.zhihu.com/api/4/news/latest";
        OkGo.get(url)
                .tag(this)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        parseJson(s);
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                    }
                });
    }

    private void parseJson(String json) {
        ZHIHuBean zhiHuBean=new Gson().fromJson(json,ZHIHuBean.class);
        if (zhiHuBean!=null){
            String title = zhiHuBean.getStories().get(0).getTitle();
            tv_requst.setText(title);
        }
    }
}
