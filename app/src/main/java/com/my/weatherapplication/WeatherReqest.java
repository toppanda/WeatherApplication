package com.my.weatherapplication;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

/**
 * Created by toppanda on 2016/10/26.
 */

public class WeatherReqest {
    private String city;
    String WEATHER_URL = "http://op.juhe.cn/onebox/weather/query?cityname=" +
            "济南" + "&key=d7c989b54f6f61db50375f4e67513437";


    public JsonObjectRequest weatherSearch(String city){
        this.city = city;
        JsonObjectRequest weatherRequest = new JsonObjectRequest(Request.Method.GET, WEATHER_URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("weatherJson",response.toString());

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        return weatherRequest;
    }


}
