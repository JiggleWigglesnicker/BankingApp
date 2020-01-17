package com.banking.bank;

import com.banking.currency.Currency;

import java.util.HashSet;


public class Account {

    //name of account
    private String accountName;

    //HashSet which Stores the amount of Currency and their Type
    private HashSet<Currency> multiCurrenciesList = new HashSet<Currency>();

    //set account name when class is initialized
    public Account(String name){
        accountName = name;
    }

    //gets accountName
    public String getAccountName(){
        return accountName;
    }

    //gets multiCurrenciesList
    public HashSet<Currency> getMultiCurrenciesList() {
        return multiCurrenciesList;
    }

    //adds currencies to the multiCurrenciesList
    public void addCurrency(Currency currency){
        multiCurrenciesList.add(currency);
    }

    // returns the wanted currency using the name of said currency
    public Currency getCurrency(String currencyName){
        Currency currency = null;
        for (Currency cur : multiCurrenciesList) {
            if (cur.getCurrencyName() == currencyName) {
                currency = cur;
            }
        }
        return currency;
    }

    //Check if there is enough money in account to afford the money conversion
    public Boolean checkIfSufficientFunds(Currency currency, Double AmountToTradeIn){
            return currency.getAmount() >= AmountToTradeIn;
    }


    //converts and sets the amount from one currency type to another
    public void conversion(Currency tradeInCurrency, Currency toReceiveCurrency, Double amountToTradeIn){
        if(checkIfSufficientFunds(tradeInCurrency,amountToTradeIn)){

            Double newAmount = tradeInCurrency.getAmount() - amountToTradeIn;
            tradeInCurrency.setAmount(newAmount);
            newAmount = toReceiveCurrency.getAmount() + toReceiveCurrency.getRate() * amountToTradeIn;
            toReceiveCurrency.setAmount(newAmount);

        }else{
            throw new ArithmeticException("Not enough funds for conversion");
        }
    }
}
