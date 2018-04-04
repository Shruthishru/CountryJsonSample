package com.compassites.kotlin.countryjsonexample;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by shruthi on 16/3/18.
 */

public interface ApiInterface {

    @GET("country/get/all")
    Call<CountryModel> getAllCountry();



}
