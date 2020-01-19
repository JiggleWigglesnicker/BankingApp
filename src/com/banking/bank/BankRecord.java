package com.banking.bank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BankRecord {
    // holds HashSet of accountHolders
    private HashSet<AccountHolder> accountHolderList = new HashSet<AccountHolder>();
    //Holds the total amount of each currency type which is stored in the account of the holders
    private HashMap<String, Double> recordTotalIndividualCurrencies = new HashMap<String, Double>();

    public BankRecord() {

    }

    // gets accountholder Hashset
    public HashSet<AccountHolder> getAccountHolderList() {
        return accountHolderList;
    }

    //adds account holder to HashSet accountHolder list
    public void addHolder(AccountHolder holder) {
        accountHolderList.add(holder);
    }

    //gets the total amount of each currency type which is stored in the account of the holders
    public HashMap<String, Double> getRecordTotalIndividualCurrencies() {
        return recordTotalIndividualCurrencies;
    }

    //calculates the total amount of different currencies stored in the account of the account holders separating them through currency type
    public void calcRecordTotalIndividualCurrencies() {
        for (AccountHolder holder : accountHolderList) {
            for (Map.Entry<String, Double> entry : holder.getTotalCurrencyList().entrySet()) {
                if (!recordTotalIndividualCurrencies.containsKey(entry.getKey())) {
                    recordTotalIndividualCurrencies.put(entry.getKey(), entry.getValue());
                } else {
                    recordTotalIndividualCurrencies.put(entry.getKey(), recordTotalIndividualCurrencies.get(entry.getKey()) + entry.getValue());
                }

            }

        }
    }

}
