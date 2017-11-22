package com.tongdao.androidlearn;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司:北京同道伟业体育科技有限公司
 * 作者：liufan
 * 时间:on 2017/7/5 15:08
 * 说明: 联赛的adapter
 */
public class LeagueAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<String> mList = new ArrayList<>();

    public LeagueAdapter(Context context) {
        mContext = context;
    }

    public void addAll(List<String> mList) {
        this.mList.addAll(mList);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LeagueHolder holder = new LeagueHolder(LayoutInflater.from(mContext).inflate(R.layout.item_league, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((LeagueHolder) holder).mTvLeague.setText(mList.get(position));
        ((LeagueHolder) holder).itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    class LeagueHolder extends RecyclerView.ViewHolder {

        TextView mTvLeague;

        public LeagueHolder(View view) {
            super(view);
            mTvLeague = (TextView) view.findViewById(R.id.tv_league);
        }
    }
}
