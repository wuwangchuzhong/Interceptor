package com.example.sdkbase.model.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/22.
 */

public class ZhihuDailyListBean {

    @SerializedName("date")
    private String data;
    @SerializedName("stories")
    private ArrayList<ZhihuDailyListItmeBean> mZhihuDailyListItmeBean;
    @SerializedName("top_stories")
    private ArrayList<ZhihuDailyListItmeBean> stories;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<ZhihuDailyListItmeBean> getmZhihuDailyListItmeBean() {
        return mZhihuDailyListItmeBean;
    }

    public void setmZhihuDailyListItmeBean(ArrayList<ZhihuDailyListItmeBean> mZhihuDailyListItmeBean) {
        this.mZhihuDailyListItmeBean = mZhihuDailyListItmeBean;
    }

    public ArrayList<ZhihuDailyListItmeBean> getStories() {
        return stories;
    }

    public void setStories(ArrayList<ZhihuDailyListItmeBean> stories) {
        this.stories = stories;
    }
}
