package com.example.sfcar.currencyconverter2017.presentation.control;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sfcar.currencyconverter2017.R;
import com.example.sfcar.currencyconverter2017.presentation.currenciesList.CurrenciesListHolder;
import com.example.sfcar.currencyconverter2017.presentation.interfaces.AdapterListOnClickListener;
import com.example.sfcar.currencyconverter2017.presentation.model.Currency;

import java.util.ArrayList;

/**
 * Created by sfcar on 15/10/2017.
 */

public class CurrenciesListAdapter extends RecyclerView.Adapter<CurrenciesListHolder> implements AdapterListOnClickListener.AdapterListener {

    private final ArrayList<Currency> currenciesList;
    private AdapterListOnClickListener.ViewListener viewListener;

    public CurrenciesListAdapter(ArrayList<Currency> currenciesList, AdapterListOnClickListener.ViewListener viewListener) {
        this.currenciesList = currenciesList;
        this.viewListener = viewListener;
    }

    @Override
    public CurrenciesListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item_currency, parent, false);
        return new CurrenciesListHolder(view, this);
    }

    @Override
    public void onBindViewHolder(CurrenciesListHolder holder, int position) {
        Currency currency = currenciesList.get(position);
        holder.bindCurrency(currency);
    }

    @Override
    public int getItemCount() {
        return currenciesList.size();
    }

    @Override
    public void onItemSelected(int position) {
        viewListener.onItemSelected(position);
    }
}
