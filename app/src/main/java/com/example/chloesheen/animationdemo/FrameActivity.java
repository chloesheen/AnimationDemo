package com.example.chloesheen.animationdemo;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameActivity extends Activity{

    private AnimationDrawable mFrameAnimation;
    private View mFrameAnimationImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        mFrameAnimationImageView = (ImageView)
                findViewById(R.id.frameAnimationImageView);
        mFrameAnimationImageView
                .setBackgroundResource(R.drawable.frame_animation);
        mFrameAnimation = (AnimationDrawable)
                mFrameAnimationImageView.getBackground();
    }

    public void showAnimation(View view) {
        mFrameAnimation.stop();
        mFrameAnimation.start();
    }
}

