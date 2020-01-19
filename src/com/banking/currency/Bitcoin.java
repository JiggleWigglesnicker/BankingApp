package com.banking.currency;

public class Bitcoin extends Currency implements CryptoRegulator {
    private Double virtualLimit;

    Bitcoin(Double amount) {
        super(amount);
        virtualLimit = 9000.0;
        this.rate = 0.3;
        this.currencyName = "Bitcoin";
    }

    public Double getCryptoLimit() {
        return virtualLimit;
    }
}
