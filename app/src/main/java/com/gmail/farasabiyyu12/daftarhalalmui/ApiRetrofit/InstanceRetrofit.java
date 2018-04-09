package com.gmail.farasabiyyu12.daftarhalalmui.ApiRetrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by farasabiyyuhandoko on 30/03/2018.
 */

public class InstanceRetrofit {
    public static final String WebURL = "https://script.googleusercontent.com/macros/";

    public static Retrofit setInit(){
        return new Retrofit.Builder()
                .baseUrl(WebURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getInstance(){
        return setInit().create(ApiService.class);
    }
}
