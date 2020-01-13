package com.Pizza;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BankRecord {

    private HashSet<AccountHolder> accountHolderList = new HashSet<AccountHolder>();
    private HashMap<String, Double> recordTotalIndividualCurrencies = new HashMap<String, Double>();

    public BankRecord(){

    }

    public HashSet<AccountHolder> getAccountHolderList(){
        return accountHolderList;
    }

    public void addHolder(AccountHolder holder){
        accountHolderList.add(holder);
    }

    public void calcRecordTotalIndividualCurrencies(){
        for(AccountHolder holder : accountHolderList){

        }
    }

    public HashMap<String,Double> getRecordTotalIndividualCurrencies(){
        return recordTotalIndividualCurrencies;
    }
}
