package com.Pizza.classes;

import java.util.HashSet;

public class AccountHolder {
    private String nameHolder;
    private HashSet<Account> accountList;

    AccountHolder(){

    }

    private String getHolderName(){
        return nameHolder;
    }

    public HashSet<Account> getAccountList() {
        return accountList;
    }

    public void addAccount(Account account){
        accountList.add(account);
    }
}
