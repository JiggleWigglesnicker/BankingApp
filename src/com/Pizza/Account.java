package com.Pizza;

import java.util.HashSet;


public class Account {
    private String accountName;
    private HashSet<Currency> multiCurrenciesList;

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

        for(Currency cur : multiCurrenciesList){
            if (cur.getCurrencyName() == currency1){
                moneyObject1 = cur;
                storedCurrencyToTrade = moneyObject1.getAmount();
            }

            if(cur.getCurrencyName() == currency2){
                moneyObject2 = cur;
                storedCurrencyToReceive = moneyObject2.getAmount();
            }

            // TODO : in andere methode dit stukje voor gemakkelijker berekeningen
            Double tempAmount = fullAmount / moneyObject2.getRate();
            tempAmount = tempAmount * moneyObject1.getRate();

            if(storedCurrencyToTrade >= tempAmount){
                Double newAmount = storedCurrencyToTrade - tempAmount;
                moneyObject1.setAmount(newAmount);
                newAmount = storedCurrencyToReceive + fullAmount;
                moneyObject2.setAmount(newAmount);

            }else{
                System.out.println("not enough money");
            }


        }
    }

    public void addCurrency(Currency currency){
        multiCurrenciesList.add(currency);
    }

}
