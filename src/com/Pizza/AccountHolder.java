package com.Pizza;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AccountHolder {
    private String nameHolder;
    private HashSet<Account> accountList = new HashSet<Account>();
    private Double totalHolderAmount = 0.0;
    private HashMap<String, Double> totalCurrencyList = new HashMap<String, Double>();

    public AccountHolder(String name){
        nameHolder = name;
    }

    public String getHolderName(){
        return nameHolder;
    }

    public Double getTotalHolderAmount(){
        return totalHolderAmount;
    }

    public HashSet<Account> getAccountList() {
        return accountList;
    }

    public void addAccount(Account account){
        accountList.add(account);
    }

    public double accountCount(){
        return accountList.size();
    }

    public void addUpIndividualAccountCurrencies(){
        HashMap<String, Double> prevAmount = new HashMap<String,Double>();

        for(Account account : accountList){
            for(Currency currency : account.getMultiCurrenciesList()){
                String nameCurrency = currency.getCurrencyName();
                Double amountCurrency = currency.getAmount();

                prevAmount.put(nameCurrency, amountCurrency);
            }

            if(totalCurrencyList.isEmpty()) {
                for(Map.Entry<String,Double> entry : prevAmount.entrySet()){
                    totalCurrencyList.put(entry.getKey(),entry.getValue());
                }
            }else{
                for(Map.Entry<String,Double> entry : prevAmount.entrySet()){
                    totalCurrencyList.put(entry.getKey(),totalCurrencyList.get(entry.getKey()) +entry.getValue() );
                }
            }
        }

    }

    public void calcTotalAmountHolder(){
        addUpIndividualAccountCurrencies();
        System.out.println(totalCurrencyList);
        Double totalAmount = 0.0;
        HashMap<String, Double> rateList = new HashMap<String,Double>();
        for(Account account : accountList){
            for(Currency currency : account.getMultiCurrenciesList()){
                String name = currency.getCurrencyName();
                Double rate = currency.getRate();
                rateList.putIfAbsent(name,rate);
            }

        }

        for(Map.Entry<String,Double> entry : totalCurrencyList.entrySet()){
            System.out.println("henk");
            for(Map.Entry<String,Double> rateMap : rateList.entrySet()){
                if(rateMap.getKey() == entry.getKey()){
                    Double calcDollarAmount = entry.getValue() * rateMap.getValue();
                    totalAmount += calcDollarAmount;
                }
            }
        }
        totalHolderAmount = totalAmount;
        System.out.println(getTotalHolderAmount());
    }


    public HashMap<String,Double> getTotalCurrencyList(){
        return totalCurrencyList;
    }
}
