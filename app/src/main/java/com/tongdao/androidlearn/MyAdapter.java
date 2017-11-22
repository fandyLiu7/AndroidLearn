package com.tongdao.androidlearn;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * 公司:北京同道伟业体育科技有限公司
 * 作者：Shinelon
 * 时间:on 2017/10/16 10:18
 * 说明:
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class myHolder extends RecyclerView.ViewHolder{

        public myHolder(View view) {
            super(view);
        }
    }

}
