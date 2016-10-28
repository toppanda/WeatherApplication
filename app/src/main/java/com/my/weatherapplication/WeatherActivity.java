package com.my.weatherapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.List;

public class WeatherActivity extends Activity implements View.OnClickListener {


    private EditText et_city;
    private Button bt_get;
    private TextView one_6, two_6, three_6, four_6, one_1, one_2, one_4, one_5, two_1, two_2, two_4, two_5, three_1, three_2, three_4, three_5, four_1, four_2, four_4, four_5;
    private ImageView one_0, two_0, three_0, four_0;
    private ViewPager mainViewPager;
    private View view1;

    private String url;
    private String cityname;

    private LinearLayout one, two, three, four;
    private RequestQueue requestQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_container);
        requestQueue = Volley.newRequestQueue(this);
        initView();
        bt_get.setOnClickListener(this);
    }

    private void initView() {
        LayoutInflater inflater = getLayoutInflater();
        mainViewPager = (ViewPager) findViewById(R.id.mainViewPager);
        view1 = inflater.inflate(R.layout.activity_weather,null);
        et_city = (EditText) findViewById(R.id.et_city);
        bt_get = (Button) findViewById(R.id.bt_get);
        one = (LinearLayout) findViewById(R.id.one);
        one_0 = (ImageView) one.findViewById(R.id.day_0);
        one_1 = (TextView) one.findViewById(R.id.day_1);
        one_2 = (TextView) one.findViewById(R.id.day_2);
        one_4 = (TextView) one.findViewById(R.id.day_4);
        one_5 = (TextView) one.findViewById(R.id.day_5);
        one_6 = (TextView) one.findViewById(R.id.day_6);
        two = (LinearLayout) findViewById(R.id.two);
        two_0 = (ImageView) two.findViewById(R.id.day_0);
        two_1 = (TextView) two.findViewById(R.id.day_1);
        two_2 = (TextView) two.findViewById(R.id.day_2);
        two_4 = (TextView) two.findViewById(R.id.day_4);
        two_5 = (TextView) two.findViewById(R.id.day_5);
        two_6 = (TextView) two.findViewById(R.id.day_6);
        three = (LinearLayout) findViewById(R.id.three);
        three_0 = (ImageView) three.findViewById(R.id.day_0);
        three_1 = (TextView) three.findViewById(R.id.day_1);
        three_2 = (TextView) three.findViewById(R.id.day_2);
        three_4 = (TextView) three.findViewById(R.id.day_4);
        three_5 = (TextView) three.findViewById(R.id.day_5);
        three_6 = (TextView) three.findViewById(R.id.day_6);
        four = (LinearLayout) findViewById(R.id.four);
        four_0 = (ImageView) four.findViewById(R.id.day_0);
        four_1 = (TextView) four.findViewById(R.id.day_1);
        four_2 = (TextView) four.findViewById(R.id.day_2);
        four_4 = (TextView) four.findViewById(R.id.day_4);
        four_5 = (TextView) four.findViewById(R.id.day_5);
        four_6 = (TextView) four.findViewById(R.id.day_6);

    }

//    private void Volley_get() {
//
//        String url = "http://op.juhe.cn/onebox/weather/query?cityname=" +
//                cityname + "&key=d7c989b54f6f61db50375f4e67513437";
//
//
//        queue = Volley.newRequestQueue(this);
//
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//
//            @Override
//            public void onResponse(String response) {
//                Volley_Json(response);
//
//                System.out.println(response);
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//            }
//        });
//
//        queue.add(stringRequest);
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_get:

                cityname = et_city.getText().toString().trim();
                requestQueue.add(weatherSearch(cityname));
                }

        }
    public JsonObjectRequest weatherSearch(String city){
        String WEATHER_URL = "http://op.juhe.cn/onebox/weather/query?cityname=" +
                city + "&key=d7c989b54f6f61db50375f4e67513437";
        JsonObjectRequest weatherRequest = new JsonObjectRequest(Request.Method.GET, WEATHER_URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Volley_Json(response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        return weatherRequest;
    }
    //setView
    public void Volley_Json(String response) {

        //System.out.println(response);

        Info info = GSONUtil.fromJson(response, Info.class);
        System.out.println("weather++"+info);


        one_6.setText(info.getResult().getData().getWeather().get(0).getDate());
        one_1.setText(info.getResult().getData().getWeather().get(0).getInfo().getDay().get(1));
        one_2.setText("白天:" + info.getResult().getData().getWeather().get(0).getInfo().getDay().get(2) + " C" +
                "   1夜间:" + info.getResult().getData().getWeather().get(0).getInfo().getNight().get(2) + " C");
        one_4.setText(info.getResult().getData().getWeather().get(0).getInfo().getDay().get(4));
        one_5.setText(info.getResult().getData().getWeather().get(0).getInfo().getDay().get(5));


        two_6.setText(info.getResult().getData().getWeather().get(1).getDate());
        two_1.setText(info.getResult().getData().getWeather().get(1).getInfo().getDay().get(1));
        two_2.setText("白天:" + info.getResult().getData().getWeather().get(1).getInfo().getDay().get(2) + " C" +
                "   1夜间:" + info.getResult().getData().getWeather().get(1).getInfo().getNight().get(2) + " C");
        two_4.setText(info.getResult().getData().getWeather().get(1).getInfo().getDay().get(4));
        two_5.setText(info.getResult().getData().getWeather().get(1).getInfo().getDay().get(5));

        three_6.setText(info.getResult().getData().getWeather().get(2).getDate());
        three_1.setText(info.getResult().getData().getWeather().get(2).getInfo().getDay().get(1));
        three_2.setText("白天:" + info.getResult().getData().getWeather().get(2).getInfo().getDay().get(2) + " C" +
                "   1夜间:" + info.getResult().getData().getWeather().get(2).getInfo().getNight().get(2) + " C");
        three_4.setText(info.getResult().getData().getWeather().get(2).getInfo().getDay().get(4));
        three_5.setText(info.getResult().getData().getWeather().get(2).getInfo().getDay().get(5));


        four_6.setText(info.getResult().getData().getWeather().get(3).getDate());
        four_1.setText(info.getResult().getData().getWeather().get(3).getInfo().getDay().get(1));

        four_2.setText("白天:" + info.getResult().getData().getWeather().get(3).getInfo().getDay().get(2) + " C" +
                "   1夜间:" + info.getResult().getData().getWeather().get(3).getInfo().getNight().get(2) + " C");
        four_4.setText(info.getResult().getData().getWeather().get(3).getInfo().getDay().get(4));
        four_5.setText(info.getResult().getData().getWeather().get(3).getInfo().getDay().get(5));


        List<String> day1 = info.getResult().getData().getWeather().get(0).getInfo().getDay();
        List<String> day2 = info.getResult().getData().getWeather().get(1).getInfo().getDay();
        List<String> day3 = info.getResult().getData().getWeather().get(2).getInfo().getDay();
        List<String> day4 = info.getResult().getData().getWeather().get(3).getInfo().getDay();

        if (day1.get(1).equals("晴")) {
            one_0.setImageResource(R.mipmap.sun);
        } else if (day1.get(1).equals("多云")) {
            one_0.setImageResource(R.mipmap.cloudy);
        } else {
            one_0.setImageResource(R.mipmap.rain);
        }

        if (day2.get(1).equals("晴")) {
            two_0.setImageResource(R.mipmap.sun);
        } else if (day2.get(1).equals("多云")) {
            two_0.setImageResource(R.mipmap.cloudy);
        } else {
            two_0.setImageResource(R.mipmap.rain);
        }

        if (day3.get(1).equals("晴")) {
            three_0.setImageResource(R.mipmap.sun);
        } else if (day3.get(1).equals("多云")) {
            three_0.setImageResource(R.mipmap.cloudy);
        } else {
            three_0.setImageResource(R.mipmap.rain);
        }

        if (day4.get(1).equals("晴")) {
            four_0.setImageResource(R.mipmap.sun);
        } else if (day4.get(1).equals("多云")) {
            four_0.setImageResource(R.mipmap.cloudy);
        } else {
            four_0.setImageResource(R.mipmap.rain);
        }


        //清空数据
        info.getResult().getData().getWeather().clear();

    }

    }





