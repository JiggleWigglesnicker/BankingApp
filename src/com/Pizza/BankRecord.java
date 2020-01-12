package com.Pizza;

import java.util.HashSet;

public class BankRecord {

    private HashSet<AccountHolder> accountHolderList;
    private Double bankTotal;

    public BankRecord(){

    }

    public HashSet<AccountHolder> getAccountHolderList(){
        return accountHolderList;
    }

    public void addHolder(AccountHolder holder){
        accountHolderList.add(holder);
    }

    public Double calcTotalCurrencies(){
        // TODO : possible calc total amount of all accounts and store in bankTotal
        return bankTotal;
    }
}
