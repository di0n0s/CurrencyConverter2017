package com.example.sfcar.currencyconverter2017.domain.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/**
 * Created by sfcar on 01/11/2017.
 */
@Element(name = "Cube")
public class CubeRateResponse {

    @Attribute(name = "rate")
    private String rate;

    @Attribute(name = "currency")
    private String currency;

    public CubeRateResponse() {
    }

    public String getRate() {
        return rate;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "CubeRateResponse{" +
                "rate='" + rate + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
