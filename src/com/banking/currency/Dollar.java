package com.banking.currency;

// TODO: Currency name vast zetten, rate vastzetten. Amount bij account toevoegen
public class Dollar extends Currency {

    public Dollar(Double amount){
        super(amount);
        this.rate = 1.0;
        this.currencyName = "Dollar";
    }


}
