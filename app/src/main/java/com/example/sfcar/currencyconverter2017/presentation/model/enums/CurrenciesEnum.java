package com.example.sfcar.currencyconverter2017.presentation.model.enums;

import com.example.sfcar.currencyconverter2017.R;

/**
 * Created by sfcar on 15/10/2017.
 */

public enum CurrenciesEnum {

    EURO(R.drawable.eur, "EUR"),
    JAPANESE_YEN(R.drawable.jpy, "JPY"),
    BULGARIAN_LEV(R.drawable.bgn, "BGN"),
    CZECH_CROWN(R.drawable.czk, "CZK"),
    DANISH_KRONE(R.drawable.dkk, "DKK"),
    POUND_STERLING(R.drawable.gbp, "GBP"),
    HUNGARIAN_FLORINT(R.drawable.huf, "HUF"),
    POLISH_ZLOTY(R.drawable.pln, "PLN"),
    ROMAIN_LEU(R.drawable.ron, "RON"),
    SWEDISH_KRONA(R.drawable.sek, "SEK"),
    AMERICAN_DOLLAR(R.drawable.usd, "USD");

    private final int flagId;
    private final String currency;


    CurrenciesEnum(int flagId, String currency) {
        this.flagId = flagId;
        this.currency = currency;
    }

}
