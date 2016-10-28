package com.my.weatherapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

/**
 * Created by toppanda on 2016/10/28.
 */

public class WeatherFragment extends Fragment implements View.OnClickListener{
    private EditText et_city;
    private Button bt_get;
    private TextView one_6, two_6, three_6, four_6, one_1, one_2, one_4, one_5, two_1, two_2, two_4, two_5, three_1, three_2, three_4, three_5, four_1, four_2, four_4, four_5;
    private ImageView one_0, two_0, three_0, four_0;
    private ViewPager mainViewPager;
    private View view;

    private String url;
    private String cityname;

    private LinearLayout one, two, three, four;
    private RequestQueue requestQueue;

    public static WeatherFragment newInstance(int num){
        WeatherFragment w = new WeatherFragment();
        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putInt("num", num);
        w.setArguments(args);

        return w;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_weather,null);
        inintFragment();
        bt_get.setOnClickListener(this);
        return view;
    }

    private void inintFragment(){
        et_city = (EditText) view.findViewById(R.id.et_city);
        bt_get = (Button) view.findViewById(R.id.bt_get);
        one = (LinearLayout) view.findViewById(R.id.one);
        one_0 = (ImageView) one.findViewById(R.id.day_0);
        one_1 = (TextView) one.findViewById(R.id.day_1);
        one_2 = (TextView) one.findViewById(R.id.day_2);
        one_4 = (TextView) one.findViewById(R.id.day_4);
        one_5 = (TextView) one.findViewById(R.id.day_5);
        one_6 = (TextView) one.findViewById(R.id.day_6);
        two = (LinearLayout) view.findViewById(R.id.two);
        two_0 = (ImageView) two.findViewById(R.id.day_0);
        two_1 = (TextView) two.findViewById(R.id.day_1);
        two_2 = (TextView) two.findViewById(R.id.day_2);
        two_4 = (TextView) two.findViewById(R.id.day_4);
        two_5 = (TextView) two.findViewById(R.id.day_5);
        two_6 = (TextView) two.findViewById(R.id.day_6);
        three = (LinearLayout) view.findViewById(R.id.three);
        three_0 = (ImageView) three.findViewById(R.id.day_0);
        three_1 = (TextView) three.findViewById(R.id.day_1);
        three_2 = (TextView) three.findViewById(R.id.day_2);
        three_4 = (TextView) three.findViewById(R.id.day_4);
        three_5 = (TextView) three.findViewById(R.id.day_5);
        three_6 = (TextView) three.findViewById(R.id.day_6);
        four = (LinearLayout) view.findViewById(R.id.four);
        four_0 = (ImageView) four.findViewById(R.id.day_0);
        four_1 = (TextView) four.findViewById(R.id.day_1);
        four_2 = (TextView) four.findViewById(R.id.day_2);
        four_4 = (TextView) four.findViewById(R.id.day_4);
        four_5 = (TextView) four.findViewById(R.id.day_5);
        four_6 = (TextView) four.findViewById(R.id.day_6);
    }

    @Override
    public void onClick(View v) {
        Log.i("clicked","sent!");
        requestQueue = MyApplication.getRequestQueue();
        cityname = et_city.getText().toString().trim();
        requestQueue.add(weatherSearch(cityname));
    }

    public JsonObjectRequest weatherSearch(String city){
        String WEATHER_URL = "http://op.juhe.cn/onebox/weather/query?cityname=" +
                city + "&key=d7c989b54f6f61db50375f4e67513437";
        JsonObjectRequest weatherRequest = new JsonObjectRequest(Request.Method.GET, WEATHER_URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("WEATHER!",response.toString());
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
