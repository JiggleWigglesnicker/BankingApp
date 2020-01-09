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

    }

    public Double calcTotalCurrencies(){
        return null;
    }
}
