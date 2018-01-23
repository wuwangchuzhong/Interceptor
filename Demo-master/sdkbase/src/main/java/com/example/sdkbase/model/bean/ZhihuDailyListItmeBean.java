package com.example.sdkbase.model.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/1/22.
 */

public class ZhihuDailyListItmeBean {

    @SerializedName("images")
    private String[] images;
    @SerializedName("type")
    private int type;
    @SerializedName("id")
    private int id;
    @SerializedName("ga_prefix")
    private String ga_prefix;
    @SerializedName("title")
    private String title;

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
