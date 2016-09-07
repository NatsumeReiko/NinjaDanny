package com.ninja.ninjadanny.splash;

import android.os.Bundle;
import android.view.View;

import com.ninja.ninjadanny.R;

import butterknife.ButterKnife;

public class Splash_005 extends Splash_001 {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ButterKnife.findById(this, R.id.title).setVisibility(View.INVISIBLE);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash_003;
    }
}
