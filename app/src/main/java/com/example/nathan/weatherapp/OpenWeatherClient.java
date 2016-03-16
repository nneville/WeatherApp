package com.example.nathan.weatherapp;

import java.util.List;
import java.util.Map;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

/**
 * Created by Quentin on 04/02/2016.
 */
public interface OpenWeatherClient {
            @GET("/weather")
            Cities cities(@QueryMap Map<String, String> query);
}

