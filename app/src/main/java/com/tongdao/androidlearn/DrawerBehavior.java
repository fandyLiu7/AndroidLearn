package com.tongdao.androidlearn;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * 公司:北京同道伟业体育科技有限公司
 * 作者：Shinelon
 * 时间:on 2017/10/16 13:56
 * 说明:
 */
public class DrawerBehavior extends CoordinatorLayout.Behavior<TextView> {
    private int mFrameMaxHeight = 100;
    private int mStartY;

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, TextView child, View dependency) {
        return dependency instanceof Toolbar;
    }

    public DrawerBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, TextView child,
                                          View dependency) {
          //记录开始的Y坐标 也就是toolbar起始Y坐标
        if (mStartY == 0) {
            mStartY = (int) dependency.getY();
        }

         //计算toolbar从开始移动到最后的百分比
        float percent = dependency.getY() / mStartY;
        Log.d("卡看看百分比", "onDependentViewChanged: " +percent);
        //改变child的坐标(从消失，到可见)
        child.setY(child.getHeight() * (1 - percent) - child.getHeight());
        return true;
    }
}
