package com.Pizza;

public class Ethereum extends Currency implements CryptoRegulator {
    private Double virtualLimit;

    Ethereum(String currencyName, Double amount, Double rate){
        super(currencyName,  amount,  rate);
    }

    public void setCryptoLimit(Double limit){

    }

    public Double getCryptoLimit(){
        return null;
    }
}
