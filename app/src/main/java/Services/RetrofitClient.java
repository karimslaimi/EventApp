package com.example.sami.cckpfe.APIConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static Retrofit retrofit=null;
    public static Retrofit getClient(String Url)
    {
        if (retrofit==null)
        {   retrofit =new Retrofit.Builder()
                .baseUrl(Url)
                .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}