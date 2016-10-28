package com.my.weatherapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by toppanda on 2016/10/28.
 */

public class HomeActivity extends FragmentActivity {
    private ViewPager viewPager;
    private View view1, view2;
    private ArrayList<Fragment> fragmentList;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_container);
        inint();
    }

    private void inint() {
        viewPager = (ViewPager) findViewById(R.id.mainViewPager);
        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new WeatherFragment());
        fragmentList.add(new WeatherFragment());

        viewPager.setAdapter(new MyFragmentAdapter(getSupportFragmentManager()));
    }
}
