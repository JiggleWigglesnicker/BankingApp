package com.Pizza.classes;

public class Bitcoin extends Currency implements CryptoRegulator {
    private Double virtualLimit;

    Bitcoin(){

    }

    @Override
    public void currencyRegulator(Double withdraw) {

    }

    @Override
    public void setCryptoLimit(Double limit) {

    }

    @Override
    public Double getCryptoLimit() {
        return virtualLimit;
    }
}
