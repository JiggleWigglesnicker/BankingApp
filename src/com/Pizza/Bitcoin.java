package com.Pizza;

public class Bitcoin extends Currency implements CryptoRegulator {
    private Double virtualLimit;

    Bitcoin(String currencyName, Double amount, Double rate){
        super(currencyName,  amount,  rate);
    }

    public void setCryptoLimit(Double limit){

    }

    public Double getCryptoLimit(){
        return null;
    }
}
