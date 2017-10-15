package com.example.sfcar.currencyconverter2017.domain.data.api;

import retrofit2.http.GET;

/**
 * Created by sfcar on 15/10/2017.
 */

interface ServerApi {

    @GET()
    Call<GetInfoResponse> getInfo();
}
