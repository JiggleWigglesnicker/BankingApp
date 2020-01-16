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

    public void conversion (String currency1, String currency2, Double fullAmount){
        Currency moneyObject1 = null;
        Currency moneyObject2 = null;

        Double storedCurrencyToTrade = 0.0;
        Double storedCurrencyToReceive = 0.0;

        for(Currency cur : multiCurrenciesList) {

            //TODO : make into methode with parameter
            if (cur.getCurrencyName() == currency1) {
                moneyObject1 = cur;
                storedCurrencyToTrade = moneyObject1.getAmount();
            }
            //TODO : make into methode with parameter
            if (cur.getCurrencyName() == currency2) {
                moneyObject2 = cur;
                storedCurrencyToReceive = moneyObject2.getAmount();
            }
        }
        //TODO: methode van maken deze berekening
            Double tempAmount = fullAmount / moneyObject2.getRate();
            tempAmount = tempAmount * moneyObject1.getRate();

            //TODO : is er genoeg geld in de bankrekening
            if(storedCurrencyToTrade >= tempAmount){
                Double newAmount = storedCurrencyToTrade - tempAmount;
                moneyObject1.setAmount(newAmount);
                newAmount = storedCurrencyToReceive + fullAmount;
                moneyObject2.setAmount(newAmount);

            }else{
                //TODO: exception here gooien
            }
    }

    public void addCurrency(Currency currency){
        multiCurrenciesList.add(currency);
    }

}
