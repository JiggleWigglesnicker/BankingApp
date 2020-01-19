package com.banking.bank;

import java.text.DecimalFormat;
import java.util.HashMap;

public class BankAdmin {

    private BankRecord bankRecord;

    public BankAdmin(BankRecord record) {
        bankRecord = record;
    }

    //The total amount of money that the bank has show in the desired currency type
    public void calcBankTotal(String currency) {
        DecimalFormat df = new DecimalFormat("0.00");
        double rate = 0.0;
        double bankMoney = 0.0;
        for (AccountHolder holder : bankRecord.getAccountHolderList()) {
            bankMoney += holder.calcTotalAmountHolder();
            rate = holder.getRate(currency);
        }
        System.out.println("The bank has " + df.format(bankMoney * rate) + " worth of " + currency);
    }

    //shows the total of each currency type that the bank possesses
    public String showTotalIndividualCurrencies() {
        HashMap<String, Double> individualTotal = bankRecord.getRecordTotalIndividualCurrencies();
        System.out.println(individualTotal.toString());
        return individualTotal.toString();
    }

    //shows poorest account holder
    public void poorestAccount() {
        DecimalFormat df = new DecimalFormat("0.00");
        String holderName = null;
        double holderTotalMoney = 0.0;

        for (AccountHolder holder : bankRecord.getAccountHolderList()) {
            if (holderTotalMoney == 0.0) {
                holderName = holder.getHolderName();
                holderTotalMoney = holder.calcTotalAmountHolder();
            } else if (holder.calcTotalAmountHolder() < holderTotalMoney) {
                holderName = holder.getHolderName();
                holderTotalMoney = holder.calcTotalAmountHolder();
            }
        }
        String holderMoney = holderName + " $" + df.format(holderTotalMoney);
        System.out.println(holderMoney);
    }

    //shows richest account Holder
    public void richestAccount() {
        DecimalFormat df = new DecimalFormat("0.00");
        String holderName = null;
        double holderTotalMoney = 0.0;
        for (AccountHolder holder : bankRecord.getAccountHolderList()) {
            if (holder.calcTotalAmountHolder() > holderTotalMoney) {
                holderName = holder.getHolderName();
                holderTotalMoney = holder.calcTotalAmountHolder();
            }
        }
        System.out.println(holderName + " $" + df.format(holderTotalMoney));
    }


    //shows which account holder has the most accounts
    public void showMostAccounts() {
        String tempName = "";
        int tempAccountCount = 0;
        for (AccountHolder acc : bankRecord.getAccountHolderList()) {
            if (acc.accountCount() > tempAccountCount) {
                tempAccountCount = acc.accountCount();
                tempName = acc.getHolderName();
            }
        }
        System.out.println(tempName + " heeft " + tempAccountCount + " accounts");
    }
}

