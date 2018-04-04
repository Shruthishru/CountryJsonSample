package com.compassites.kotlin.countryjsonexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shruthi on 16/3/18.
 */

public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.CountryViewHolder> {

    private List<ResultClass> countryList;

    public CountryListAdapter() {
        countryList = new ArrayList<>();
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.country_list, parent, false);
        return new CountryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        ResultClass rc = countryList.get(position);
        holder.countryName.setText(rc.getName());
    }

    @Override
    public int getItemCount() {
        if (countryList != null) {
            return countryList.size();
        }
        return 0;
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {
        public TextView countryName;

        public CountryViewHolder(View view) {
            super(view);
            countryName = view.findViewById(R.id.tv_country_name);
        }

    }
    public void setData(List<ResultClass> countryList){
        if (countryList!=null && countryList.size()>0) {
            this.countryList = countryList;
            notifyDataSetChanged();
        }
    }


}
