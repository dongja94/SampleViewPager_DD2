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

        initData();
    }

    private void initData() {
        for (int i = 0; i < 5; i++) {
            mAdapter.add("item " + i);
        }
    }
}
