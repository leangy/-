package com.example.root.fangfangweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 2019/4/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
