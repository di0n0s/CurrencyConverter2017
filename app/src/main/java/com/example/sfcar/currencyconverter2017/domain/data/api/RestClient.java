package com.example.sfcar.currencyconverter2017.domain.data.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by sfcar on 15/10/2017.
 */

class RestClient {

    private static final Long TIMEOUT_CONNECTION_VALUE = 60L;
    private static final Long TIMEOUT_READ_VALUE = 60L;
    private static final Long TIMEOUT_WRITE_VALUE = 60L;

    static <S> S createService(Class<S> serviceClass) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .connectTimeout(TIMEOUT_CONNECTION_VALUE, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT_READ_VALUE, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT_WRITE_VALUE, TimeUnit.SECONDS);
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml")
                .addConverterFactory(SimpleXmlConverterFactory.create());
        return builder.client(httpClient.build()).build().create(serviceClass);


    }
}
