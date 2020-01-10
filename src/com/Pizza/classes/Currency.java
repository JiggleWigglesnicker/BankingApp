package com.Pizza.classes;

import java.util.Scanner;

public abstract class Currency {
    private String currencyName;
    private Double amount;
    private static Double rate;

    Currency(){

    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    private void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    private void setRate(Double rate) {
        this.rate = rate;
    }
//static, want veranderd niet per geld soort
    public static Double getRate() {
        return rate;
    }

    public abstract void currencyRegulator(Double withdraw);


}
