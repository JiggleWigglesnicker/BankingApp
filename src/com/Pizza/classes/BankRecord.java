package com.Pizza.classes;

import java.util.HashSet;

public class BankRecord {

    private HashSet<AccountHolder> accountHolderList;
    private Double bankTotal;

    BankRecord(){

    }

    public HashSet<AccountHolder> getAccountHolderList(){
        return accountHolderList;
    }

    public void addHolder(AccountHolder holder){
        accountHolderList.add(holder);
    }

    public Double calcTotalCurrencies(){
        //possible calc total amount of all accounts and store in bankTotal
        return bankTotal;
    }
}
