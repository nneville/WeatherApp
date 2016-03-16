package com.example.nathan.weatherapp;

import android.os.AsyncTask;
import android.util.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Quentin on 04/02/2016.
 */
public class taskWeather extends AsyncTask<Void, Integer, Void> {

    @Override
    protected Void doInBackground(Void... params){
        OpenWeatherClient weather = ServiceGenerator.createService(OpenWeatherClient.class);
        Map<String, String> query = new HashMap<>();
        query.put("q","London");
        query.put("appid","44db6a862fba0b067b1930da0d769e98");
        Cities city = weather.cities(query);

            Log.d("SearchActivity",
                    city.base + " (" + city.id + ")");

        return null;
    }
}
