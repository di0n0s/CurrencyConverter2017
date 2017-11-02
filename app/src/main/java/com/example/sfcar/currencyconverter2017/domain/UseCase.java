package com.example.sfcar.currencyconverter2017.domain;

/**
 * Created by sfcar on 01/11/2017.
 */

public interface UseCase<T> {
    void onSuccess(T item);
    void onError(String error);
}
