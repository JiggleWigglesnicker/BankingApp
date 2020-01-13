package com.Pizza;

public class BankAdmin {


    private BankRecord bankRecord;

    public BankAdmin(BankRecord record) {
        bankRecord = record;
    }

    public String calcBankTotal(String currency) {
        return null;
    }

    public String showTotalIndividualCurrencies() {
        return null;
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
        String holderMoney = holderName + " " + holderTotalMoney;
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
            String holderMoney = holderName + " " + holderTotalMoney;
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

