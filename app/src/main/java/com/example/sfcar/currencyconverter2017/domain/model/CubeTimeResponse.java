package com.example.sfcar.currencyconverter2017.domain.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;

/**
 * Created by sfcar on 01/11/2017.
 */
@Root(name = "Cube", strict = false)
public class CubeTimeResponse {

    @ElementList(entry = "Cube", inline = true, type = CubeRateResponse.class)
    private ArrayList<CubeRateResponse> cubeRateList;

    @Attribute(name = "time")
    private String time;

    public CubeTimeResponse() {
    }

    public ArrayList<CubeRateResponse> getCubeRateList() {
        return cubeRateList;
    }

    public String getTime() {
        return time;
    }
}
