package com.example.konsul_semarang.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer
{
    private static final String baseURL= "http://192.168.1.13/konsul/";
    private static Retrofit retro;

    public static Retrofit konekRetrofit()
    {
        if (retro==null)
        {
            retro= new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retro;
    }
}
