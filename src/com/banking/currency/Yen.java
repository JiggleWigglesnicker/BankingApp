package com.banking.currency;
// TODO: Currency name vast zetten, rate vastzetten. Amount bij account toevoegen
public class Yen extends Currency {

    public Yen(Double amount){
        super(amount);
        this.rate = 110.0;
        this.currencyName = "Yen";
    }

}
