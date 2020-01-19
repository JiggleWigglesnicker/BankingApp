package com.banking.currency;

public class Ethereum extends Currency implements CryptoRegulator {
    private Double virtualLimit;

    Ethereum(Double amount) {
        super(amount);
        virtualLimit = 100000.0;
        this.rate = 0.1;
        this.currencyName = "Ethereum";
    }

    public Double getCryptoLimit() {
        return virtualLimit;
    }
}
