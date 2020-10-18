package com.example.konsul_semarang.API;

import com.example.konsul_semarang.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData

{
    @GET("retrieve.php")
    Call<ResponseModel> ardRetrieveData();

}
