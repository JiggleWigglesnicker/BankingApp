package com.Pizza;

import java.util.HashMap;

public class BankAdmin {

    private BankRecord bankRecord;

    public BankAdmin(BankRecord record) {
        bankRecord = record;
    }

    public String calcBankTotal(String currency) {
        return null;
    }

    public String showTotalIndividualCurrencies() {
        HashMap<String,Double> individualTotal = bankRecord.getRecordTotalIndividualCurrencies();
        System.out.println(individualTotal.toString());
        return individualTotal.toString();
    }

    public String poorestAccount() {
        return null;
    }

    public String richestAccount() {
        return null;
    }

    public String showMostAccounts() {
        String tempName = "";
        Double tempAccountCount = 0.0;

        for (AccountHolder acc : bankRecord.getAccountHolderList()) {
            if (acc.accountCount() > tempAccountCount) {
                tempAccountCount = acc.accountCount();
                tempName = acc.getHolderName();
            }
        }
        String personWithAccounts = tempName + " " + tempAccountCount.toString();
        System.out.println(personWithAccounts);
        return personWithAccounts;
    }
}
