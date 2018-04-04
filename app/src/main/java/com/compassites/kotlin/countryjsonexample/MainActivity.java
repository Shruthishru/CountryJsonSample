package com.compassites.kotlin.countryjsonexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private CountryListAdapter countryListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        getData();
    }

    private void initViews() {
        RecyclerView recyclerView = findViewById(R.id.rv_country);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        countryListAdapter = new CountryListAdapter();
        recyclerView.setAdapter(countryListAdapter);
    }

    private void getData() {
        ApiInterface apiInterface = ApiManager.getClient().create(ApiInterface.class);
        Call<CountryModel> call = apiInterface.getAllCountry();
        call.enqueue(new Callback<CountryModel>() {
            @Override
            public void onResponse(Call<CountryModel> call, Response<CountryModel> response) {
                Log.d(MainActivity.class.getSimpleName(), "country list");
                countryListAdapter.setData(response.body().getRestResponse().getResultClass());
            }

            @Override
            public void onFailure(Call<CountryModel> call, Throwable t) {
                Log.e(MainActivity.class.getSimpleName(), "error");
            }
        });
    }
}