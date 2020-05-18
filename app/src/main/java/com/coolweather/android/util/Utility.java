package com.coolweather.android.util;

import android.text.TextUtils;

import com.coolweather.android.db.City;
import com.coolweather.android.db.County;
import com.coolweather.android.db.Province;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.Response;

/**
 * Created by dsh on 2020/5/18.
 */

public class Utility {
    private Utility() {}

    public static boolean handleProvinceReponse(String response) {
        if (TextUtils.isEmpty(response)) {
            return false;
        }

        try {
            JSONArray provinces = new JSONArray(response);
            for (int i = 0; i < provinces.length(); i++) {
                JSONObject jsonObject = provinces.getJSONObject(i);
                Province province = new Province();
                province.setName(jsonObject.getString("name"));
                province.setCode(jsonObject.getInt("id"));
                province.save();
            }
        } catch (JSONException e) {
            return false;
        }

        return true;
    }

    public static  boolean handleCityReponse(String response, int provinceId) {
        if (TextUtils.isEmpty(response)) {
            return false;
        }

        try {
            JSONArray cities = new JSONArray(response);
            for (int i = 0; i < cities.length(); i++) {
                JSONObject jsonObject = cities.getJSONObject(i);
                City city = new City();
                city.setCode(jsonObject.getInt("id"));
                city.setName(jsonObject.getString("name"));
                city.setProvinceId(provinceId);
                city.save();
            }
        } catch (JSONException e) {
            return false;
        }
        return true;
    }

    public static boolean handleCountyReponse(String response, int cityId) {
        if (TextUtils.isEmpty(response)) {
            return false;
        }

        try {
            JSONArray counties = new JSONArray(response);
            for (int i = 0; i < counties.length(); i++) {
                JSONObject jsonObject = counties.getJSONObject(i);
                County county = new County();
                county.setWeatherId(jsonObject.getString("weather_id"));
                county.setName(jsonObject.getString("name"));
                county.setCityId(cityId);
                county.save();
            }
        } catch (JSONException e) {
            return false;
        }
        return true;
    }
}
