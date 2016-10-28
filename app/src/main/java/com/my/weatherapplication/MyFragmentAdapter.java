package com.my.weatherapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by toppanda on 2016/10/28.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {


    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return WeatherFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
