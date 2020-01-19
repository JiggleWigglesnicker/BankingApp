package com.banking.currency;

public class Dollar extends Currency {

    public Dollar(Double amount) {
        super(amount);
        this.rate = 1.0;
        this.currencyName = "Dollar";
    }
}
