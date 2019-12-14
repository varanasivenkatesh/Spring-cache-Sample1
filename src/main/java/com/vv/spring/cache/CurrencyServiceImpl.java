package com.vv.spring.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("CurrencyService")
public class CurrencyServiceImpl implements CurrencyService{

    @Cacheable("currency")
    public CountryCurrency getByname(String countryName) {
        System.out.println("CurrencyServiceImpl.getByname");
        //data base call to load the data
        return new CountryCurrency(countryName, "INR");
    }

@CacheEvict(value = "currency", allEntries = true)
    public void refreshAllItems() {
        // this method is flush the values present in cache

    }

    public void slowDownLookupOperation()
    {
        try {
            long time = 100000L;
            Thread.sleep(time);
        }
        catch (InterruptedException e)
        {
            throw new IllegalStateException(e);
        }
    }
}
