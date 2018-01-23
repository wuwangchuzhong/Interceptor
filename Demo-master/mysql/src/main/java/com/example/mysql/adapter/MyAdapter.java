package com.example.mysql.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mysql.MainActivity;
import com.example.mysql.R;
import com.example.mysql.entity.HomePage;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private List<String> images;
    private List<HomePage.DataBean.AdsBean> data;
    private  Context mContext;

    public void setImages(List<String> images, List<HomePage.DataBean.AdsBean> data, Context mContext) {
        this.images=images;
        this.data=data;
        this.mContext=mContext;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.itme_recy_viewholder,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder= (MyViewHolder) holder;
        myViewHolder.tv_text3.setText(data.get(position).getLinke());
        myViewHolder.tv_text2.setText(data.get(position).getPicture());
        myViewHolder.tv_text1.setText(data.get(position).getTitle());
        myViewHolder.tv_text4.setText(data.get(position).getSort()+"");
        myViewHolder.tv_text5.setText(data.get(position).getSourceId());
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_text1;
        private TextView tv_text2;
        private TextView tv_text3;
        private TextView tv_text4;
        private TextView tv_text5;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_text1= (TextView) itemView.findViewById(R.id.tv_text1);
            tv_text2= (TextView) itemView.findViewById(R.id.tv_text2);
            tv_text3= (TextView) itemView.findViewById(R.id.tv_text3);
            tv_text4= (TextView) itemView.findViewById(R.id.tv_text4);
            tv_text5= (TextView) itemView.findViewById(R.id.tv_text5);

        }
    }

}
