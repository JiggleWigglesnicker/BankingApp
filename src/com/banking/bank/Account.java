package com.banking.bank;

import com.banking.currency.Currency;

import java.util.HashSet;


public class Account {
    private String accountName;
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

    public void addCurrency(Currency currency){
        multiCurrenciesList.add(currency);
    }

    // returns currency using the name of the currency in String
    public Currency getCurrency(String currencyName){
        Currency currency = null;
        for (Currency cur : multiCurrenciesList) {
            if (cur.getCurrencyName() == currencyName) {
                currency = cur;
            }
        }
        return currency;
    }

    //returns the amount in the to trade in currency
    public Double toTradeInCurrency(String tradeInCurrency) {
        Double storedCurrencyToTrade = 0.0;
        for (Currency cur : multiCurrenciesList) {
            if (cur.getCurrencyName() == tradeInCurrency) {
                storedCurrencyToTrade = getCurrency(tradeInCurrency).getAmount();
            }
        }
        return storedCurrencyToTrade;
    }

    //returns the amount in the to receive currency
    public Double toReceivingCurrency(String receivingCurrency){
        Double storedCurrencyToReceive = 0.0;
        for(Currency cur : multiCurrenciesList) {
            if (cur.getCurrencyName() == receivingCurrency) {
                storedCurrencyToReceive = getCurrency(receivingCurrency).getAmount();
            }
        }
        return storedCurrencyToReceive;
    }

    //calculates the amount of money you will be receiving into the currency you will be trading in
      public void calcReceivingCurrencyAmount(double amountWantingToReceive, Currency toTradeIn, Currency toReceive ){
//        Double calculatedToReceiveAmount = 0.0;
//        wantingToRecieve = amountWantingToReceive;
//        tempAmount = amountWantingToReceive / getCurrency().getRate();
//        tempAmount = tempAmount * tradeInCurrencyObject.getRate();
    }

    //
    public void checkAndSetBalance() {
//        if (storedCurrencyToTrade >= tempAmount) {
//            Double newAmount = storedCurrencyToTrade - tempAmount;
//            tradeInCurrencyObject.setAmount(newAmount);
//            newAmount = storedCurrencyToReceive + wantingToRecieve;
//            recievingCurrencyObject.setAmount(newAmount);
//        }
//        else
//            {
//                //TODO: exception here gooien
//            }
    }

    public void conversion(String currencyToTradeIn, String currencyToReceive, Double wantedAmount){

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
//            //TODO :p make into methode with arameter
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

}
