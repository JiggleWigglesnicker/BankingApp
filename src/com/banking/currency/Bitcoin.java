package com.banking.currency;

public class Bitcoin extends Currency implements CryptoRegulator {
    private Double virtualLimit;

    Bitcoin(String currencyName, Double amount, Double rate){
        super(currencyName,  amount,  rate);
    }

    //TODO: private make nen afschermen zodat het niet van buiten verandert kan worden
    public void setCryptoLimit(Double limit){

    }

    public Double getCryptoLimit(){
        return null;
    }
}