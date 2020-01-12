package com.Pizza.classes;

public class Ethereum extends Currency implements CryptoRegulator {
    private Double virtualLimit;

    @Override
    public void setCryptoLimit(Double limit) {

    }

    @Override
    public Double getCryptoLimit() {
        return virtualLimit;
    }

}
