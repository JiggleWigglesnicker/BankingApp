package com.banking.bank;

import com.banking.currency.Currency;

import java.util.HashSet;


public class Account {
    private String accountName;

    private Currency tradeInCurrencyObject = null;
    private Currency recievingCurrencyObject = null;
    private Double storedCurrencyToTrade = 0.0;
    private Double storedCurrencyToReceive = 0.0;
    private Double tempAmount = 0.0;
    private Double wantingToRecieve = 0.0;
    private HashSet<Currency> multiCurrenciesList = new HashSet<Currency>();

    public Account(String name){
        accountName = name;
    }

    public String getAccountName(){
        return accountName;
    }

    public HashSet<Currency> getMultiCurrenciesList() {
        return multiCurrenciesList;
    }

    // haalt het geld type van wat je wilt inruilen op en hoeveel je er van hebt
    public void tradeInCurrency(String tradeInCurrency) {
        for (Currency cur : multiCurrenciesList) {
            if (cur.getCurrencyName() == tradeInCurrency) {
                tradeInCurrencyObject = cur;
                storedCurrencyToTrade = tradeInCurrencyObject.getAmount();
            }
        }
    }

    //zoekt het geld wat je wilt ontvangen en kijkt hoeveel je hier van hebt
    public void recievingCurrency(String recievingCurrency){
        for(Currency cur : multiCurrenciesList) {
            if (cur.getCurrencyName() == recievingCurrency) {
                recievingCurrencyObject = cur;
                storedCurrencyToReceive = recievingCurrencyObject.getAmount();
            }
        }
    }


    //calculates the amount of money you will be recieving into the currency you will be trading in
    public void recievingToTradeIn(double amountWantingToRecieve){
        wantingToRecieve = amountWantingToRecieve;
        tempAmount = amountWantingToRecieve / recievingCurrencyObject.getRate();
        tempAmount = tempAmount * tradeInCurrencyObject.getRate();
    }


    public void checkAndSetBalance() {
        if (storedCurrencyToTrade >= tempAmount) {
            Double newAmount = storedCurrencyToTrade - tempAmount;
            tradeInCurrencyObject.setAmount(newAmount);
            newAmount = storedCurrencyToReceive + wantingToRecieve;
            recievingCurrencyObject.setAmount(newAmount);
        }
        else
            {
                //TODO: exception here gooien
            }
    }



//
//    public void conversion (String tradeInCurrency, String recievingCurrency, Double wantingToRecieve){
//        Currency tradeInCurrencyObject = null;
//        Currency recievingCurrencyObject = null;
//
//        Double storedCurrencyToTrade = 0.0;
//        Double storedCurrencyToReceive = 0.0;
//
//        for(Currency cur : multiCurrenciesList) {
//
//            //TODO : make into methode with parameter
//            if (cur.getCurrencyName() == tradeInCurrency) {
//                tradeInCurrencyObject = cur;
//                storedCurrencyToTrade = tradeInCurrencyObject.getAmount();
//            }
//            //TODO : make into methode with parameter
//            if (cur.getCurrencyName() == recievingCurrency) {
//                recievingCurrencyObject = cur;
//                storedCurrencyToReceive = recievingCurrencyObject.getAmount();
//            }
//        }
//        //TODO: methode van maken deze berekening
//            Double tempAmount = wantingToRecieve / recievingCurrencyObject.getRate();
//            tempAmount = tempAmount * tradeInCurrencyObject.getRate();
//
//            //TODO : is er genoeg geld in de bankrekening
//            if(storedCurrencyToTrade >= tempAmount){
//                Double newAmount = storedCurrencyToTrade - tempAmount;
//                tradeInCurrencyObject.setAmount(newAmount);
//                newAmount = storedCurrencyToReceive + wantingToRecieve;
//                recievingCurrencyObject.setAmount(newAmount);
//
//            }else{
//                //TODO: exception here gooien
//            }
//    }

    public void addCurrency(Currency currency){
        multiCurrenciesList.add(currency);
    }

}
