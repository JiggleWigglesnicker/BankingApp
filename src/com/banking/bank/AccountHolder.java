package com.banking.bank;

import com.banking.currency.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AccountHolder {

    // Name of the accountHolder
    private String nameHolder;

    // HashSet which contains the Account added to this account holder
    private HashSet<Account> accountList = new HashSet<Account>();

    //Contains a HashMap of the total amount of currencies divided by currency type
    private HashMap<String, Double> totalCurrencyList = new HashMap<String, Double>();

    //set account holder name when class is initialized
    public AccountHolder(String name) {
        nameHolder = name;
    }

    //gets name of account holder
    public String getHolderName() {
        return nameHolder;
    }

    //gets HashSet of accounts in account holder
    public HashSet<Account> getAccountList() {
        return accountList;
    }

    //adds an account to the accountList HashSet
    public void addAccount(Account account) {
        accountList.add(account);
    }

    //count how many accounts the account holder has
    public int accountCount() {
        return accountList.size();
    }

    //gets HashMap of the totalCurrencyList field
    public HashMap<String, Double> getTotalCurrencyList() {
        return totalCurrencyList;
    }


    // Gets the rate of a currency using the currency name
    public Double getRate(String currencyName) {
        Double rate = 0.0;
        for (Account account : accountList) {
            if (account.getCurrency(currencyName) != null) {
                rate = account.getCurrency(currencyName).getRate();
            }

        }
        return rate;
    }


    //Adds up the amount from all the different currencies types and stores it in a HashMap
    public void addUpIndividualAccountCurrencies() {
        HashMap<String, Double> prevAmount = new HashMap<String, Double>();

        for (Account account : accountList) {
            for (Currency currency : account.getMultiCurrenciesList()) {
                String nameCurrency = currency.getCurrencyName();
                Double amountCurrency = currency.getAmount();
                prevAmount.put(nameCurrency, amountCurrency);
            }

            if (totalCurrencyList.isEmpty()) {
                for (Map.Entry<String, Double> entry : prevAmount.entrySet()) {
                    totalCurrencyList.put(entry.getKey(), entry.getValue());
                }
            } else {
                for (Map.Entry<String, Double> entry : prevAmount.entrySet()) {
                    totalCurrencyList.put(entry.getKey(), totalCurrencyList.get(entry.getKey()) + entry.getValue());
                }
            }
        }

    }

    // calculates and returns the total combined of money a account holder has in dollars
    public Double calcTotalAmountHolder() {
        Double totalAmount = 0.0;
        for (Account account : accountList) {
            totalAmount += account.totalAccountAmountInDollars();
        }
        return totalAmount;
    }


}
