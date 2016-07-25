package com.begentgroup.sampleviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentAdapterActivity extends AppCompatActivity {

    ViewPager pager;
    MyFragmentPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_adapter);
        pager = (ViewPager)findViewById(R.id.pager);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(mAdapter);

        initData();
    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            mAdapter.add("item " + i);
        }
    }
}
