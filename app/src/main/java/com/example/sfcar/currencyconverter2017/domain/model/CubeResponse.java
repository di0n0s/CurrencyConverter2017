package com.example.sfcar.currencyconverter2017.domain.model;

import org.simpleframework.xml.Element;

/**
 * Created by sfcar on 01/11/2017.
 */
@Element(name = "Cube")
public class CubeResponse {

    @Element(name = "Cube")
    private CubeTimeResponse cubeTimeResponse;

    public CubeResponse() {
    }

    public CubeTimeResponse getCubeTimeResponse() {
        return cubeTimeResponse;
    }
}
