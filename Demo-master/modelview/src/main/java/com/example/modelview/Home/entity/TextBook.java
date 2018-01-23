package com.example.modelview.Home.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/1/3.
 *
 */

public class TextBook {
    /**
     * data : {"ads":[{"ad_sourceType":"0","linke":"http://wei.yidianchina.com/#/auction/site/19588496","picture":"http://picture1.yidianchina.com/assets/upload/image/ebe7ee7f09c000c769799f59921cd104.jpeg","pictureId":19936558,"sort":10,"sourceId":"19588496","title":"北京保利十二周年秋季拍卖会"},{"ad_sourceType":"5","linke":"http://topic.yidianchina.com/2017/liveauction/index.html","picture":"http://picture1.yidianchina.com/assets/upload/image/501f3264c28a8ee6c6a7e997b0ea3652.png","pictureId":18140370,"sort":2,"sourceId":"2","title":"同步拍新功能"},{"ad_sourceType":"5","linke":"http://topic.yidianchina.com/2017/tongbupai/","picture":"http://picture1.yidianchina.com/assets/upload/image/d0513ece49df27701be146e3c1532b27.png","pictureId":18140341,"sort":1,"sourceId":"1","title":"同步拍新玩法"}]}
     * message : 查询成功
     * stateCode : 101
     */

    private DataBean data;
    private String message;
    private int stateCode;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public static class DataBean {
        private List<AdsBean> ads;

        public List<AdsBean> getAds() {
            return ads;
        }

        public void setAds(List<AdsBean> ads) {
            this.ads = ads;
        }

        public static class AdsBean {
            /**
             * ad_sourceType : 0
             * linke : http://wei.yidianchina.com/#/auction/site/19588496
             * picture : http://picture1.yidianchina.com/assets/upload/image/ebe7ee7f09c000c769799f59921cd104.jpeg
             * pictureId : 19936558
             * sort : 10
             * sourceId : 19588496
             * title : 北京保利十二周年秋季拍卖会
             */

            private String ad_sourceType;
            private String linke;
            private String picture;
            private int pictureId;
            private int sort;
            private String sourceId;
            private String title;

            public String getAd_sourceType() {
                return ad_sourceType;
            }

            public void setAd_sourceType(String ad_sourceType) {
                this.ad_sourceType = ad_sourceType;
            }

            public String getLinke() {
                return linke;
            }

            public void setLinke(String linke) {
                this.linke = linke;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public int getPictureId() {
                return pictureId;
            }

            public void setPictureId(int pictureId) {
                this.pictureId = pictureId;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public String getSourceId() {
                return sourceId;
            }

            public void setSourceId(String sourceId) {
                this.sourceId = sourceId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
