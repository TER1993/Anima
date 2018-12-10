package com.speedata.anima.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.LinearLayout;

import com.speedata.anima.R;

/**
 * @author xuyan  演示动画
 */
public class AnimaActivity extends AppCompatActivity {

    private LayoutAnimationController mLayoutAnimationController;
    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anima);
        initView();
    }

    private void initView() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.text_alpha);
        animation.setFillAfter(true);
        mLayoutAnimationController = new LayoutAnimationController(animation);
        mLayoutAnimationController.setOrder(LayoutAnimationController.ORDER_NORMAL);

        mLinearLayout = findViewById(R.id.layout);
        mLinearLayout.setLayoutAnimation(mLayoutAnimationController);

    }

    @Override
    protected void onResume() {
        super.onResume();
        startAnima();
    }

    private void startAnima() {
        mLinearLayout.setVisibility(View.VISIBLE);
        mLayoutAnimationController.start();
    }
}
