package com.vv.spring.cache;

import java.io.Serializable;

public class CountryCurrency implements Serializable {
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CountryCurrency{");
        sb.append("countryName='").append(countryName).append('\'');
        sb.append(", countryCurrency='").append(countryCurrency).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private String countryName;
    private String countryCurrency;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCurrency() {
        return countryCurrency;
    }

    public void setCountryCurrency(String countryCurrency) {
        this.countryCurrency = countryCurrency;
    }

    public CountryCurrency(String countryName, String countryCurrency) {
        this.countryName = countryName;
        this.countryCurrency = countryCurrency;
    }


}
