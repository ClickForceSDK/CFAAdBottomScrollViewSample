package com.cathaybk.home.work.cfaadbottomscrollviewsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;

import com.clickforce.ad.AdBottomScrollView;
import com.clickforce.ad.Listener.AdBottomScrollViewListener;

public class MainActivity extends AppCompatActivity {
    private AdBottomScrollView adBottomScrollView;
    private ScrollView sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sc = (ScrollView) findViewById(R.id.scrollview);

        adBottomScrollView = (AdBottomScrollView) findViewById(R.id.adBottomScrollView);
        adBottomScrollView.getAd(13148);
        adBottomScrollView.setScrollview(sc);
        adBottomScrollView.outputDebugInfo = true;
        adBottomScrollView.setOnAdBottomScrollViewListener(new AdBottomScrollViewListener() {
            @Override
            public void onSuccessToAdBottomScrollView() {
                adBottomScrollView.show();
                Log.d("ClickForce","onSuccessToAdBottomScrollView");
            }

            @Override
            public void onFailToAdBottomScrollView() {
                Log.d("ClickForce","onFailToAdBottomScrollView");
            }

            @Override
            public void onClickToAdBottomScrollView() {
                Log.d("ClickForce","onClickToAdBottomScrollView");
            }

            @Override
            public void onCloseToAdBottomScrollView() {
                Log.d("ClickForce","onCloseToAdBottomScrollView");
            }
        });
    }
}