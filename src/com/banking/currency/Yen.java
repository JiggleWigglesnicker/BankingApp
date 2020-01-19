package com.banking.currency;

public class Yen extends Currency {

    public Yen(Double amount){
        super(amount);
        this.rate = 0.01;
        this.currencyName = "Yen";
    }

}
