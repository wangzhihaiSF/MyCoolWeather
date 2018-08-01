package com.example.generalsf.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public NOW now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;


}
