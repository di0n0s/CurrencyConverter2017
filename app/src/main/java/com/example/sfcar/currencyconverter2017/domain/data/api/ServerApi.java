package com.example.sfcar.currencyconverter2017.domain.data.api;

import com.example.sfcar.currencyconverter2017.domain.model.CurrenciesValuesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sfcar on 15/10/2017.
 */

public interface ServerApi {

    @GET("eurofxref-daily.xml")
    Call<CurrenciesValuesResponse> getCurrenciesValues();
}
