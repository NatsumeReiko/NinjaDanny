package com.ninja.ninjadanny.splash;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.ninja.ninjadanny.DannyBaseActy;
import com.ninja.ninjadanny.R;
import com.ninja.ninjadanny.utility.DtMker;
import com.ninja.ninjadanny.utility.PicHandler;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Splash_001 extends DannyBaseActy {

    final int[] icons = {
            R.mipmap.coffee_bean_128_001,
            R.mipmap.coffee_bean_128_002,
            R.mipmap.coffee_bean_128_003};

    @BindView(R.id.background_view)
    ImageView bgImg;

    @BindView(R.id.icon)
    ImageView iconImg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());

        ButterKnife.bind(this);

        iconImg.setImageResource(icons[DtMker.randInt(0, icons.length - 1)]);

        bgImg.setImageBitmap(
                PicHandler.blurBitmap001(
                        BitmapFactory.decodeResource(getResources(), R.mipmap.sample_001),
                        (DtMker.randFloat(6.0f, 24.0f)), appCtx));
    }

    protected int getLayoutId() {
        return R.layout.activity_splash_001;
    }
}
