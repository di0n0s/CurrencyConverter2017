package com.example.sfcar.currencyconverter2017.presentation.model;

/**
 * Created by sfcar on 15/10/2017.
 */
public class Currency {

    private String flag;
    private String currencyName;
    private double currencyValue;

    public Currency() {
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(double currencyValue) {
        this.currencyValue = currencyValue;
    }
}
