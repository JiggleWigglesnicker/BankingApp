package com.Pizza;

import java.text.DecimalFormat;
import java.util.HashMap;

public class BankAdmin {
    private static DecimalFormat df = new DecimalFormat("0.00");

    private BankRecord bankRecord;

    public BankAdmin(BankRecord record) {
        bankRecord = record;
    }

    public void calcBankTotal(String currency) {
        double rate = 0.0;
        double bankMoney = 0.0;
        double total = 0.0;
        for (AccountHolder holder : bankRecord.getAccountHolderList()) {
            bankMoney += holder.getTotalHolderAmount();
        }
        for (AccountHolder holder : bankRecord.getAccountHolderList()) {
            HashMap<String, Double> moneyList = new HashMap<String,Double>(holder.getRateList());
            rate = moneyList.get(currency);

        }
        total = bankMoney * rate;
        System.out.println("The bank has " + df.format(total)+ " worth of " + currency);
    }
    public String showTotalIndividualCurrencies() {
        HashMap<String,Double> individualTotal = bankRecord.getRecordTotalIndividualCurrencies();
        System.out.println(individualTotal.toString());
        return individualTotal.toString();
    }

    public void poorestAccount() {
        String holderName = null;
        double holderTotalMoney = 0.0;

        for (AccountHolder holder : bankRecord.getAccountHolderList()) {
            if (holderTotalMoney == 0.0){
                holderName = holder.getHolderName();
                holderTotalMoney = holder.getTotalHolderAmount();
            }
            else if(holder.getTotalHolderAmount() < holderTotalMoney)
            {
                holderName = holder.getHolderName();
                holderTotalMoney = holder.getTotalHolderAmount();
            }
        }
        String holderMoney = holderName + " " + df.format(holderTotalMoney);
        System.out.println(holderMoney);
    }
        public void richestAccount () {
            String holderName = null;
            double holderTotalMoney = 0.0;
            for (AccountHolder holder : bankRecord.getAccountHolderList()) {
                if (holder.getTotalHolderAmount() > holderTotalMoney) {
                    holderName = holder.getHolderName();
                    holderTotalMoney = holder.getTotalHolderAmount();
                }
            }
            String holderMoney = holderName + " " + df.format(holderTotalMoney);
            System.out.println(holderMoney);
    }
        public String showMostAccounts () {
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

