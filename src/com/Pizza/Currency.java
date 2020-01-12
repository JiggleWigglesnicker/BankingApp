package com.Pizza;

public abstract class Currency {
    private String currencyName;
    private Double amount;
    private Double rate;

    Currency(String currencyName, Double amount, Double rate){
        this.currencyName = currencyName;
        this.amount = amount;
        this.rate = rate;
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

    public Double getRate() {
        return rate;
    }



}
