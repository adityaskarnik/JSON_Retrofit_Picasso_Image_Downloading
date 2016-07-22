package com.adityapc.aditya.retrofitimagedownloading;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by aditya on 21/7/16.
 */

public interface RequestInterface {

    @GET("json/get/VyYCRsKwZ")
    Call<JSONResponse> getJSON();
}
