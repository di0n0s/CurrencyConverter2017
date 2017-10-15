package com.example.sfcar.currencyconverter2017.presentation.currenciesList;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sfcar.currencyconverter2017.R;
import com.example.sfcar.currencyconverter2017.presentation.base.BaseFragment;
import com.example.sfcar.currencyconverter2017.presentation.control.CurrenciesListAdapter;
import com.example.sfcar.currencyconverter2017.presentation.interfaces.AdapterListOnClickListener;
import com.example.sfcar.currencyconverter2017.presentation.model.Currency;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class CurrenciesListFragment extends BaseFragment implements AdapterListOnClickListener.ViewListener {

    private CurrenciesListAdapter currenciesListAdapter;
    private ArrayList<Currency> currenciesList;
    private Unbinder unbinder;
    private static final String TAG = "CurrenciesListFragment";

    @BindView(R.id.currencies_recycler_view)
    RecyclerView currenciesRecyclerView;

    public CurrenciesListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_currencies_list, container, false);
        unbinder = ButterKnife.bind(this, view);
        updateAdapter();
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    private void updateAdapter() {
        currenciesListAdapter = new CurrenciesListAdapter(currenciesList, this);
        currenciesRecyclerView.setAdapter(currenciesListAdapter);
    }

    @Override
    protected String getFragmentTag() {
        return TAG;
    }


    @Override
    public void onItemSelected(int position) {

    }

}
