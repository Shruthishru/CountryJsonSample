package com.compassites.kotlin.countryjsonexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shruthi on 16/3/18.
 */

public class ResultClass {

    @SerializedName("name")
    private String name;

    @SerializedName("alpha2_code")
    private String codeAlpha;

    @SerializedName("alpha3_code")
    private String code;

    public String getName() {
        return name;
    }

    public ResultClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ResultClass{" +
                "name='" + name + '\'' +
                ", codeAlpha='" + codeAlpha + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
