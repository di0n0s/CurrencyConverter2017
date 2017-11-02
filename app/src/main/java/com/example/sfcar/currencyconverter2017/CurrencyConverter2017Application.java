package com.example.sfcar.currencyconverter2017;

import android.app.Application;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by sfcar on 15/10/2017.
 */

public class CurrencyConverter2017Application extends Application {

    private static CurrencyConverter2017Application instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Fabric.with(this, new Crashlytics());

    }
}
