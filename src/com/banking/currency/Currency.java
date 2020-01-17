package com.banking.currency;

public abstract class Currency {
    protected String currencyName;
    private Double amount;
    protected Double rate;

    Currency(Double amount){
        this.amount = amount;
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
