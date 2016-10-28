package com.my.weatherapplication;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by toppanda on 2016/10/28.
 */

public class MyApplication extends Application {
    private static RequestQueue requestQueue;
    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue = Volley.newRequestQueue(getApplicationContext());
    }

    public static RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
