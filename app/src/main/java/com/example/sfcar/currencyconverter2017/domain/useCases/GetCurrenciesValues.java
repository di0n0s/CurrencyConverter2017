package com.example.sfcar.currencyconverter2017.domain.useCases;

import com.example.sfcar.currencyconverter2017.domain.UseCase;
import com.example.sfcar.currencyconverter2017.domain.data.source.Source;
import com.example.sfcar.currencyconverter2017.domain.data.source.SourceImp;
import com.example.sfcar.currencyconverter2017.domain.model.CurrenciesValuesResponse;

/**
 * Created by sfcar on 01/11/2017.
 */

public class GetCurrenciesValues {

    private final SourceImp sourceImp;

    public GetCurrenciesValues(SourceImp sourceImp) {
        this.sourceImp = sourceImp;
    }

    public void getAsync(final UseCase<CurrenciesValuesResponse> listener){
        sourceImp.getCurrenciesValues(new Source.GetCurrenciesValuesCallback() {
            @Override
            public void onGetCurrenciesValuesResponse(CurrenciesValuesResponse currenciesValuesResponse) {
                listener.onSuccess(currenciesValuesResponse);
            }

            @Override
            public void onError(String error) {
                listener.onError(error);
            }
        });
    }
}
