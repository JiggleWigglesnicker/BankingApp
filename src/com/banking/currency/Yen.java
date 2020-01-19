package com.banking.currency;

public class Yen extends Currency {

    public Yen(Double amount){
        super(amount);
        this.rate = 0.0121;
        this.currencyName = "Yen";
    }

}
