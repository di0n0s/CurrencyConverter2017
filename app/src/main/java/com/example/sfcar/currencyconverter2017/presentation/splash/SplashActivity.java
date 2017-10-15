package com.example.sfcar.currencyconverter2017.presentation.splash;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.sfcar.currencyconverter2017.presentation.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment createFragment() {
        return new SplashFragment();

    }
}
