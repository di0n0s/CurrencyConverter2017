package com.example.sfcar.currencyconverter2017.domain.data.api;

/**
 * Created by sfcar on 15/10/2017.
 */

public class Service {

    public ServerApi getService() {
        return RestClient.createService(ServerApi.class);
    }
}
