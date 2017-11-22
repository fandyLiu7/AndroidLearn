package com.tongdao.androidlearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cn.jzvd.JZVideoPlayer;

/**
 * @Company 北京同道伟业体育科技有限公司
 * @date 创建时间:2017/10/16
 * @user
 * @Description Coordinator的学习
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button btnOne = (Button) findViewById(R.id.btn_one);
        Button btnTwo = (Button) findViewById(R.id.btn_two);
        Button btnThree = (Button) findViewById(R.id.btn_three);
        Button btnFour = (Button) findViewById(R.id.btn_four);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_one:
                startActivity(new Intent(this, OneActivity.class));
                break;
            case R.id.btn_two:
                startActivity(new Intent(this, TwoActivity.class));
                break;
            case R.id.btn_three:
                startActivity(new Intent(this, ThreeActivity.class));
                break;
            case R.id.btn_four:
                startActivity(new Intent(this, FourActivity.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (JZVideoPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }
    @Override
    protected void onPause() {
        super.onPause();
        JZVideoPlayer.releaseAllVideos();
    }
}
