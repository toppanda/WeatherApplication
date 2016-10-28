package com.my.weatherapplication;

import android.util.Log;

import java.util.List;

/**
 * Created by toppanda on 2016/10/27.
 */

public class WeatherData {
    private String cityname;
    public WeatherData(String response){
        Info info = GSONUtil.fromJson(response, Info.class);
        System.out.println("weather++"+info);
        //清空数据
        cityname = info.getResult().getData().getRealtime().getCity_name();
        Log.i("CITY",cityname);
        info.getResult().getData().getWeather().clear();
    }




    public String getCityname() {
        return cityname;
    }

}
