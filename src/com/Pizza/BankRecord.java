package com.Pizza;

import java.util.HashSet;

public class BankRecord {

    private HashSet<AccountHolder> accountHolderList = new HashSet<AccountHolder>();
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
    public void mostAccountsHolder()
    {
        //wellicht hier een list voor de naam hebben, want meerdere mensen kunnen evenveel accounts hebben?
        String tempName = null;
        Double tempAccountCount = null;

        for(AccountHolder acc : accountHolderList){
            if(acc.accountCount() > tempAccountCount){
                tempAccountCount = acc.accountCount();
                tempName = acc.getHolderName();
            }
        }
    }
}
