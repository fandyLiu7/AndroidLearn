package com.tongdao.androidlearn;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * 公司:北京同道伟业体育科技有限公司
 * 作者：Shinelon
 * 时间:on 2017/10/16 11:36
 * 说明:
 */
public class EasyBehavior extends CoordinatorLayout.Behavior<TextView> {

    public EasyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, TextView child, View dependency) {
        return dependency instanceof TextView;//依赖的具体是哪一个
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, TextView child, View dependency) {
        child.setX(dependency.getX() + 200);
        child.setY(dependency.getY() + 200);
        child.setText(dependency.getX() + "," + dependency.getY());
        return true;
    }
}
