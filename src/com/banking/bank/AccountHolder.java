package com.banking.bank;

import com.banking.currency.Currency;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AccountHolder {
    private String nameHolder;
    private HashSet<Account> accountList = new HashSet<Account>();
    //TODO: Holder amount moet weg kan worden berekent en worden gereturned
    //private Double totalHolderAmount = 0.0;
    private HashMap<String, Double> totalCurrencyList = new HashMap<String, Double>();
    private HashMap<String, Double> rateList = new HashMap<String,Double>();

    public AccountHolder(String name){
        nameHolder = name;
    }

    public String getHolderName(){
        return nameHolder;
    }

    //TODO: MOET WEG HIER TOTALHOLDERAMOUNT MOET GERETURNED WORDEN IN EEN METHOD
//    public Double getTotalHolderAmount(){
//        return totalHolderAmount;
//    }

    public HashSet<Account> getAccountList() {
        return accountList;
    }

    public void addAccount(Account account){
        accountList.add(account);
    }

    public double accountCount(){
        return accountList.size();
    }

    //TODO: APARTE METHODES MAKEN ALS HET KAN
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
        Double totalAmount = 0.0;
        for(Account account : accountList){
            for(Currency currency : account.getMultiCurrenciesList()){
                String name = currency.getCurrencyName();
                Double rate = currency.getRate();
                rateList.putIfAbsent(name,rate);
            }

        }

        for(Map.Entry<String,Double> entry : totalCurrencyList.entrySet()){
            for(Map.Entry<String,Double> rateMap : rateList.entrySet()){
                if(rateMap.getKey() == entry.getKey()){
                    Double calcDollarAmount = entry.getValue() / rateMap.getValue();
                    totalAmount += calcDollarAmount;
                }
            }
        }
        //TODO: returen hier total amount
        //totalHolderAmount = totalAmount;
    }

    public HashMap<String,Double> getRateList(){
        return rateList;
    }
    public HashMap<String,Double> getTotalCurrencyList(){
        return totalCurrencyList;
    }
}