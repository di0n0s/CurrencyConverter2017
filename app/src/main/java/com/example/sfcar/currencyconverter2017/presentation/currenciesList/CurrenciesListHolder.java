package com.example.sfcar.currencyconverter2017.presentation.currenciesList;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sfcar.currencyconverter2017.R;
import com.example.sfcar.currencyconverter2017.presentation.interfaces.AdapterListOnClickListener;
import com.example.sfcar.currencyconverter2017.presentation.model.Currency;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sfcar on 15/10/2017.
 */

public class CurrenciesListHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private AdapterListOnClickListener.AdapterListener adapterListener;

    @BindView(R.id.flag_image_view)
    ImageView flagImageView;
    @BindView(R.id.currency_name_text_view)
    private TextView currencyNameTextView;
    @BindView(R.id.currency_value_text_view)
    private TextView currencyValueTextView;


    public CurrenciesListHolder(View itemView, AdapterListOnClickListener.AdapterListener adapterListener) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.adapterListener = adapterListener;
    }

    public void bindCurrency(Currency currency) {
        currencyNameTextView.setText(currency.getCurrencyName());
        currencyValueTextView.setText(String.valueOf(currency.getCurrencyValue()));

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        adapterListener.onItemSelected(getAdapterPosition());
    }
}
