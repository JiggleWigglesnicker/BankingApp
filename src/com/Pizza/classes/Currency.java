package com.Pizza.classes;

public abstract class Currency {
    private String currencyName;
    private Double amount;
    private Double rate;

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

    public Double getRate() {
        return rate;
    }

    public abstract void currencyRegulator(Double withdraw);
}
