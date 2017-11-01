package com.example.sfcar.currencyconverter2017.domain.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by sfcar on 01/11/2017.
 */
@Root(name = "gesmes:Envelope", strict = false)
public class CurrenciesValuesResponse {

    @Element(name = "gesmes:subject", required = false)
    private String gesmesSubject;

    @Element(name = "gesmes:Sender", required = false)
    private GesmesSenderResponse gesmesSenderResponse;

    @Element(name = "Cube")
    private CubeResponse cubeResponse;

    public CurrenciesValuesResponse() {
    }

    public String getGesmesSubject() {
        return gesmesSubject;
    }

    public GesmesSenderResponse getGesmesSenderResponse() {
        return gesmesSenderResponse;
    }

    public CubeResponse getCubeResponse() {
        return cubeResponse;
    }
}
