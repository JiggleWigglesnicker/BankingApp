package com.banking.currency;

public class Euro extends Currency {

    public Euro(Double amount){
        super(amount);
        this.rate = 0.81;
        this.currencyName = "Euro";
    }
}
