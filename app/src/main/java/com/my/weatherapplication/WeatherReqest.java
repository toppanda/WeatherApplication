package com.my.weatherapplication;

import android.util.Log;
import android.view.VelocityTracker;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by toppanda on 2016/10/26.
 */

public class WeatherReqest {
    private Info info;
    private String city_name="null";
    public JsonObjectRequest weatherSearch(String city){
        String WEATHER_URL = "http://op.juhe.cn/onebox/weather/query?cityname=" +
                city + "&key=d7c989b54f6f61db50375f4e67513437";
        JsonObjectRequest weatherRequest = new JsonObjectRequest(Request.Method.GET, WEATHER_URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        info = GSONUtil.fromJson(response.toString(), Info.class);
                        System.out.println("weather++"+info);
                        city_name = info.getResult().getData().getRealtime().getCity_name();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        return weatherRequest;
    }

    public String getCity_name() {

        return city_name;
    }
}
