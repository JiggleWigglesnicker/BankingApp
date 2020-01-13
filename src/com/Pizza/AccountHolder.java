package com.Pizza;

import java.util.HashSet;

public class AccountHolder {
    private String nameHolder;
    private HashSet<Account> accountList = new HashSet<Account>();

    public AccountHolder(String name){
        nameHolder = name;
    }

    public String getHolderName(){
        return nameHolder;
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
}
