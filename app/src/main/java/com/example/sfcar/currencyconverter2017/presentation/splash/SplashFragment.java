package com.example.sfcar.currencyconverter2017.presentation.splash;


import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sfcar.currencyconverter2017.R;
import com.example.sfcar.currencyconverter2017.presentation.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SplashFragment extends BaseFragment {

    private static final String TAG = "SplashFragment";


    public SplashFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                goToCurrencyListActivity();
            }
        }, 3000);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    @Override
    protected String getFragmentTag() {
        return TAG;
    }

    private void goToCurrencyListActivity() {
        getActivity().finish();
        //TODO initActivity to ListCurrencyActivity

    }

}
