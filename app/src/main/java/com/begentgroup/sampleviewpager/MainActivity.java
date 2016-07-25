package com.begentgroup.sampleviewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager)findViewById(R.id.pager);

        mAdapter = new MyPagerAdapter();

        pager.setAdapter(mAdapter);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTitle("page : " + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        setTitle("page : 0");

        initData();
    }

    private void initData() {
        for (int i = 0; i < 5; i++) {
            mAdapter.add("item " + i);
        }
    }
}
