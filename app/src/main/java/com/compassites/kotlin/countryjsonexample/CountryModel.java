package com.compassites.kotlin.countryjsonexample;

import android.support.v4.app.ServiceCompat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shruthi on 16/3/18.
 */

public class CountryModel {

    @SerializedName("RestResponse")
    private RestResponse restResponse;

    @Override
    public String toString() {
        return "CountryModel{" +
                "restResponse=" + restResponse +
                '}';
    }

    public RestResponse getRestResponse() {
        return restResponse;
    }
}
