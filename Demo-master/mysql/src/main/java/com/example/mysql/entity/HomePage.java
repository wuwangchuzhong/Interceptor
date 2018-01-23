package com.example.mysql.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/11/30.
 */
public class HomePage {

    private DataBean data;
    /**
     * data : {"ads":[{"ad_sourceType":"3","linke":"","picture":"http://59.110.112.73:81/assets/upload/image/0bd3d43e3620a5b27f12c2fc851f2a62.jpg","pictureId":7161128,"sort":1,"sourceId":"7036139","title":"测试艺评"}]}
     * message : 查询成功
     * stateCode : 101
     */

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
        /**
         * ad_sourceType : 3
         * linke :
         * picture : http://59.110.112.73:81/assets/upload/image/0bd3d43e3620a5b27f12c2fc851f2a62.jpg
         * pictureId : 7161128
         * sort : 1
         * sourceId : 7036139
         * title : 测试艺评
         */

        private List<AdsBean> ads;

        public List<AdsBean> getAds() {
            return ads;
        }

        public void setAds(List<AdsBean> ads) {
            this.ads = ads;
        }

        public static class AdsBean {
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


//    /**
//     * id : 18115
//     * name : 【1】电影交易打包-11.30-12.4
//     * commonTitle :
//     * imgUrl : http://p0.meituan.net/mmc/c4bd168632200b606bd2c30aeaddd81654130.jpg
//     * imgUrlSize : (640, 150)
//     * bigImgTypeUrl : http://p0.meituan.net/mmc/c4bd168632200b606bd2c30aeaddd81654130.jpg
//     * bigImgUrlSize : (640, 150)
//     * app : movie
//     * type : 3
//     * typeDesc : 链接到应用内部页面
//     * standIdList : [11]
//     * startTime : 1480493820000
//     * endTime : 1480867140000
//     * level : 1
//     * newUser : -1
//     * closable : 2
//     * channelType : 0
//     * channelListMap : {}
//     * businessName :
//     * businessIds :
//     * url : meituanmovie://www.meituan.com/web?url=http://i.meituan.com/firework/DBZTY1128MY
//     * movieIdList : []
//     */
//
//    private List<DataBean> data;
//
//    public List<DataBean> getData() {
//        return data;
//    }
//
//    public void setData(List<DataBean> data) {
//        this.data = data;
//    }
//
//    public static class DataBean {
//        private int id;
//        private String name;
//        private String commonTitle;
//        private String imgUrl;
//        private String imgUrlSize;
//        private String bigImgTypeUrl;
//        private String bigImgUrlSize;
//        private String app;
//        private int type;
//        private String typeDesc;
//        private long startTime;
//        private long endTime;
//        private int level;
//        private int newUser;
//        private int closable;
//        private int channelType;
//        private ChannelListMapBean channelListMap;
//        private String businessName;
//        private String businessIds;
//        private String url;
//        private List<Integer> standIdList;
//        private List<?> movieIdList;
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getCommonTitle() {
//            return commonTitle;
//        }
//
//        public void setCommonTitle(String commonTitle) {
//            this.commonTitle = commonTitle;
//        }
//
//        public String getImgUrl() {
//            return imgUrl;
//        }
//
//        public void setImgUrl(String imgUrl) {
//            this.imgUrl = imgUrl;
//        }
//
//        public String getImgUrlSize() {
//            return imgUrlSize;
//        }
//
//        public void setImgUrlSize(String imgUrlSize) {
//            this.imgUrlSize = imgUrlSize;
//        }
//
//        public String getBigImgTypeUrl() {
//            return bigImgTypeUrl;
//        }
//
//        public void setBigImgTypeUrl(String bigImgTypeUrl) {
//            this.bigImgTypeUrl = bigImgTypeUrl;
//        }
//
//        public String getBigImgUrlSize() {
//            return bigImgUrlSize;
//        }
//
//        public void setBigImgUrlSize(String bigImgUrlSize) {
//            this.bigImgUrlSize = bigImgUrlSize;
//        }
//
//        public String getApp() {
//            return app;
//        }
//
//        public void setApp(String app) {
//            this.app = app;
//        }
//
//        public int getType() {
//            return type;
//        }
//
//        public void setType(int type) {
//            this.type = type;
//        }
//
//        public String getTypeDesc() {
//            return typeDesc;
//        }
//
//        public void setTypeDesc(String typeDesc) {
//            this.typeDesc = typeDesc;
//        }
//
//        public long getStartTime() {
//            return startTime;
//        }
//
//        public void setStartTime(long startTime) {
//            this.startTime = startTime;
//        }
//
//        public long getEndTime() {
//            return endTime;
//        }
//
//        public void setEndTime(long endTime) {
//            this.endTime = endTime;
//        }
//
//        public int getLevel() {
//            return level;
//        }
//
//        public void setLevel(int level) {
//            this.level = level;
//        }
//
//        public int getNewUser() {
//            return newUser;
//        }
//
//        public void setNewUser(int newUser) {
//            this.newUser = newUser;
//        }
//
//        public int getClosable() {
//            return closable;
//        }
//
//        public void setClosable(int closable) {
//            this.closable = closable;
//        }
//
//        public int getChannelType() {
//            return channelType;
//        }
//
//        public void setChannelType(int channelType) {
//            this.channelType = channelType;
//        }
//
//        public ChannelListMapBean getChannelListMap() {
//            return channelListMap;
//        }
//
//        public void setChannelListMap(ChannelListMapBean channelListMap) {
//            this.channelListMap = channelListMap;
//        }
//
//        public String getBusinessName() {
//            return businessName;
//        }
//
//        public void setBusinessName(String businessName) {
//            this.businessName = businessName;
//        }
//
//        public String getBusinessIds() {
//            return businessIds;
//        }
//
//        public void setBusinessIds(String businessIds) {
//            this.businessIds = businessIds;
//        }
//
//        public String getUrl() {
//            return url;
//        }
//
//        public void setUrl(String url) {
//            this.url = url;
//        }
//
//        public List<Integer> getStandIdList() {
//            return standIdList;
//        }
//
//        public void setStandIdList(List<Integer> standIdList) {
//            this.standIdList = standIdList;
//        }
//
//        public List<?> getMovieIdList() {
//            return movieIdList;
//        }
//
//        public void setMovieIdList(List<?> movieIdList) {
//            this.movieIdList = movieIdList;
//        }
//
//        public static class ChannelListMapBean {
//        }
//    }
}
