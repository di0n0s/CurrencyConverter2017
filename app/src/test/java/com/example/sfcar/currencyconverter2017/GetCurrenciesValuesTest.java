package com.example.sfcar.currencyconverter2017;

import com.example.sfcar.currencyconverter2017.domain.data.source.Source;
import com.example.sfcar.currencyconverter2017.domain.data.source.SourceImp;
import com.example.sfcar.currencyconverter2017.domain.model.CubeRateResponse;
import com.example.sfcar.currencyconverter2017.domain.model.CurrenciesValuesResponse;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by sfcar on 01/11/2017.
 */

public class GetCurrenciesValuesTest {

    private void getCurrenciesValues(){
        SourceImp repository = new SourceImp();
        final AtomicReference<CurrenciesValuesResponse> response = new AtomicReference<>();
        repository.getCurrenciesValues(new Source.GetCurrenciesValuesCallback() {
            @Override
            public void onGetCurrenciesValuesResponse(CurrenciesValuesResponse currenciesValuesResponse) {
                response.set(currenciesValuesResponse);
            }

            @Override
            public void onError(String error) {
                System.out.println("onError" + error);
            }
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (CubeRateResponse cubeRateResponse : response.get().getCubeResponse().getCubeTimeResponse().getCubeRateList()){
            System.out.println(cubeRateResponse.toString());
        }
    }

    @Test
    public void launchTest(){
        getCurrenciesValues();
    }
}
