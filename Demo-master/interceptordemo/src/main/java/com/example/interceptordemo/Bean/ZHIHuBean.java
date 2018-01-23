package com.example.interceptordemo.Bean;

import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */

public class ZHIHuBean  {

    /**
     * date : 20180123
     * stories : [{"images":["https://pic2.zhimg.com/v2-5cb03a116336e61536bfbd5cb529bde9.jpg"],"type":0,"id":9667181,"ga_prefix":"012310","title":"甘薇：走不出「贾跃亭之妻」的阴影"},{"images":["https://pic4.zhimg.com/v2-8eab9a47aea125186c73c79aa7394e07.jpg"],"type":0,"id":9667305,"ga_prefix":"012309","title":"不想写论文症又犯了，怎么治？"},{"images":["https://pic3.zhimg.com/v2-972c8ee9c7c73cb52489f1d64bde0656.jpg"],"type":0,"id":9667306,"ga_prefix":"012308","title":"保安涉嫌在学校保安室性侵七岁双胞胎姐妹，女孩说，老师没救人"},{"images":["https://pic4.zhimg.com/v2-146b4c0743c16522bfe84964ee8fc9d7.jpg"],"type":0,"id":9667135,"ga_prefix":"012307","title":"人过了 30，哪些体检项目一定不能落下？"},{"images":["https://pic2.zhimg.com/v2-f5c444228411008f72df0f6bed7f4aa5.jpg"],"type":0,"id":9667355,"ga_prefix":"012307","title":"百度 All in AI，李彦宏 All in 陆奇"},{"images":["https://pic2.zhimg.com/v2-7c97a4a402d54e5dc8e2828297a9cb3d.jpg"],"type":0,"id":9667071,"ga_prefix":"012307","title":"开放的美国，为何要严格禁止师生恋？"},{"images":["https://pic4.zhimg.com/v2-9d63cecb869fa41511ee9fac3e00b2d3.jpg"],"type":0,"id":9667254,"ga_prefix":"012306","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic3.zhimg.com/v2-e5e5e782b5efdc613a9f356155e8394a.jpg","type":0,"id":9667071,"ga_prefix":"012307","title":"开放的美国，为何要严格禁止师生恋？"},{"image":"https://pic3.zhimg.com/v2-f114a566be5226079d0300459ead3dc6.jpg","type":0,"id":9667135,"ga_prefix":"012307","title":"人过了 30，哪些体检项目一定不能落下？"},{"image":"https://pic4.zhimg.com/v2-80e9503b218925ff2861ef65de350f53.jpg","type":0,"id":9667305,"ga_prefix":"012309","title":"不想写论文症又犯了，怎么治？"},{"image":"https://pic2.zhimg.com/v2-24bfc7026c96ec212691c376303a8925.jpg","type":0,"id":9667306,"ga_prefix":"012308","title":"保安涉嫌在学校保安室性侵七岁双胞胎姐妹，女孩说，老师没救人"},{"image":"https://pic1.zhimg.com/v2-a0e3706b28f93575d916e92b0dd64ee0.jpg","type":0,"id":9667126,"ga_prefix":"012219","title":"无印良品全球第一家酒店在深圳开业，950 元起，你会去住吗？"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic2.zhimg.com/v2-5cb03a116336e61536bfbd5cb529bde9.jpg"]
         * type : 0
         * id : 9667181
         * ga_prefix : 012310
         * title : 甘薇：走不出「贾跃亭之妻」的阴影
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

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

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic3.zhimg.com/v2-e5e5e782b5efdc613a9f356155e8394a.jpg
         * type : 0
         * id : 9667071
         * ga_prefix : 012307
         * title : 开放的美国，为何要严格禁止师生恋？
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
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
}
