package com.example.sfcar.currencyconverter2017.domain.data.source;

import com.example.sfcar.currencyconverter2017.domain.model.CurrenciesValuesResponse;

/**
 * Created by sfcar on 01/11/2017.
 */

public interface Source {

    interface GetCurrenciesValuesCallback{
        void onGetCurrenciesValuesResponse(CurrenciesValuesResponse currenciesValuesResponse);
        void onError(String error);
    }

    void getCurrenciesValues(GetCurrenciesValuesCallback callback);
}
