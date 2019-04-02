package com.example.root.fangfangweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 2019/4/1.
 */

public class Now {
    @SerializedName("temp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
