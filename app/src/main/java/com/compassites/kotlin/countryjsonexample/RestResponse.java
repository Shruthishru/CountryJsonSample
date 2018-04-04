package com.compassites.kotlin.countryjsonexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by shruthi on 16/3/18.
 */

public class RestResponse {

    @SerializedName("messages")
    private List<String> messages;

    @SerializedName("result")
    private List<ResultClass> resultClass;

    @Override
    public String toString() {
        return "RestResponse{" +
                "messages=" + messages +
                ", resultClass=" + resultClass +
                '}';
    }

    public List<String> getMessages() {
        return messages;
    }

    public List<ResultClass> getResultClass() {
        return resultClass;
    }
}
