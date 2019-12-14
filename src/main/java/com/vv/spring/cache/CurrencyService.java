package com.vv.spring.cache;

public interface CurrencyService {

    CountryCurrency getByname(String countryName);
    void refreshAllItems();
}
