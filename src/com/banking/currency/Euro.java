package com.banking.currency;
// TODO: Currency name vast zetten, rate vastzetten. Amount bij account toevoegen
public class Euro extends Currency {

    public Euro(Double amount){
        super(amount);
        this.rate = 0.81;
        this.currencyName = "Euro";
    }

}
