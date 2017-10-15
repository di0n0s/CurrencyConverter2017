package com.example.sfcar.currencyconverter2017.presentation.base;


import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {


    public BaseFragment() {
        // Required empty public constructor
    }

    protected void initActivity(Class<?> activity) {
        Intent intent = new Intent(getContext(), activity);
        startActivity(intent);
    }

    protected abstract String getFragmentTag();


}
