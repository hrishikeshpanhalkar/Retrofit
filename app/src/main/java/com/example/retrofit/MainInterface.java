package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

interface MainInterface {
    @GET("v2/list")
    Call<String> STRING_CALL();

}
