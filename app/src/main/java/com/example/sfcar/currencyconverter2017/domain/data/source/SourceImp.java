package com.example.sfcar.currencyconverter2017.domain.data.source;

import com.example.sfcar.currencyconverter2017.domain.data.api.ServerApi;
import com.example.sfcar.currencyconverter2017.domain.data.api.Service;
import com.example.sfcar.currencyconverter2017.domain.model.CurrenciesValuesResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by sfcar on 01/11/2017.
 */

public class SourceImp implements Source {

    @Override
    public void getCurrenciesValues(final GetCurrenciesValuesCallback callback) {
        ServerApi serverApi = Service.getService();
        Call<CurrenciesValuesResponse> currenciesValuesResponseCall = serverApi.getCurrenciesValues();
        System.out.println("URl -> " + currenciesValuesResponseCall.request().url());
        currenciesValuesResponseCall.enqueue(new Callback<CurrenciesValuesResponse>() {
            @Override
            public void onResponse(Call<CurrenciesValuesResponse> call, Response<CurrenciesValuesResponse> response) {
                System.out.println(response.body().toString());
                callback.onGetCurrenciesValuesResponse(response.body());
            }

            @Override
            public void onFailure(Call<CurrenciesValuesResponse> call, Throwable t) {
                callback.onError(t.toString());
            }
        });

    }
}
