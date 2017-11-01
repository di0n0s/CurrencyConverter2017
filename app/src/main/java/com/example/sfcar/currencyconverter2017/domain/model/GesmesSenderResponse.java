package com.example.sfcar.currencyconverter2017.domain.model;

import org.simpleframework.xml.Element;

/**
 * Created by sfcar on 01/11/2017.
 */

@Element(name = "gesmes:Sender")
public class GesmesSenderResponse {

    @Element(name = "gesmes:name")
    private String gesmesName;

    public GesmesSenderResponse(String gesmesName) {
    }

    public String getGesmesName() {
        return gesmesName;
    }
}
