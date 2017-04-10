package com.xa.jiaoda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterHome();

    }
    /**
     * 进入主界面函数
     */
    private void enterHome() {
        Intent intent = new Intent(this, ShortRoadActivity.class);
        startActivity(intent);
        finish();
    }
    /**
     * 添加淡入动画效果
     */
    private void initAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
        alphaAnimation.setDuration(3000);
        findViewById(R.id.activity_main).startAnimation(alphaAnimation);
        enterHome();
    }
}
