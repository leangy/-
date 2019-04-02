package com.example.root.fangfangweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by root on 2019/4/2.
 */

public class Weather {
    public String status;
    public Basic Basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;
}
