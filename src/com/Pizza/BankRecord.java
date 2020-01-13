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
            for (Map.Entry<String,Double> entry : holder.getTotalCurrencyList().entrySet()){
                if(!recordTotalIndividualCurrencies.containsKey(entry.getKey())){
                    recordTotalIndividualCurrencies.put(entry.getKey(),entry.getValue());
                }else{
                    recordTotalIndividualCurrencies.put(entry.getKey(), recordTotalIndividualCurrencies.get(entry.getKey()) +entry.getValue());
                }

            }

        }

        System.out.println(recordTotalIndividualCurrencies);
    }

    public HashMap<String,Double> getRecordTotalIndividualCurrencies(){
        return recordTotalIndividualCurrencies;
    }
}
