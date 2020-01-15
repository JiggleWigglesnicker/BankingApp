package com.banking.bank;

import java.text.DecimalFormat;
import java.util.HashMap;

public class BankAdmin {
    private static DecimalFormat df = new DecimalFormat("0.00");

    private BankRecord bankRecord;

    public BankAdmin(BankRecord record) {
        bankRecord = record;
    }

    //TODO: methode needs to bemodified here and in another class
    //hier word de totale hoeveelheid geld in 1 type currency getoont. Alles word omgerekent naar 1 type
    public void calcBankTotal(String currency) {
//        double rate = 0.0;
//        double bankMoney = 0.0;
//        //Hier word er door alle accountholder geloopt, waar ze alle geld al hebben staan, terwijl deze al omgezet is, en word het geld opgeteld
//        for (AccountHolder holder : bankRecord.getAccountHolderList()) {
//            //TODO: gives error because function is scraped and need to be replaced or modified
//            //bankMoney += holder.getTotalHolderAmount();
//        }
//        //hier word het totale bedrag vermenigvuldigt met de rate waardoor je de correcte hoeveelheid hebt
//        for (AccountHolder holder : bankRecord.getAccountHolderList()) {
//            HashMap<String, Double> moneyList = new HashMap<String,Double>(holder.getRateList());
//            rate = moneyList.get(currency);
//        }
//        System.out.println("The bank has " + df.format(bankMoney * rate)+ " worth of " + currency);
    }

    public String showTotalIndividualCurrencies() {
        HashMap<String,Double> individualTotal = bankRecord.getRecordTotalIndividualCurrencies();
        System.out.println(individualTotal.toString());
        return individualTotal.toString();
    }

    //TODO: methode needs to bemodified here and in another class
    public void poorestAccount() {
//        String holderName = null;
//        double holderTotalMoney = 0.0;
//
//        for (AccountHolder holder : bankRecord.getAccountHolderList()) {
//            //Hier word de eerste persoon geinstancierd
//            if (holderTotalMoney == 0.0){
//                holderName = holder.getHolderName();
//                //TODO: gives error because function is scraped and need to be replaced or modified
//                holderTotalMoney = holder.getTotalHolderAmount();
//            }
//            //hier word er vergeleken met de huidige armste persoon
//            else if(holder.getTotalHolderAmount() < holderTotalMoney)
//            {
//                holderName = holder.getHolderName();
//                holderTotalMoney = holder.getTotalHolderAmount();
//            }
//        }
//        String holderMoney = holderName + " " + df.format(holderTotalMoney);
//        System.out.println(holderName + " " + df.format(holderTotalMoney));
    }
    //TODO: methode needs to bemodified here and in another class
        public void richestAccount () {
//            String holderName = null;
//            double holderTotalMoney = 0.0;
//            for (AccountHolder holder : bankRecord.getAccountHolderList()) {
//                //hier word er vergeleken met de huidige rijkste persoon
//                if (holder.getTotalHolderAmount() > holderTotalMoney) {
//                    holderName = holder.getHolderName();
//                    holderTotalMoney = holder.getTotalHolderAmount();
//                }
//            }
//            System.out.println(holderName + " " + df.format(holderTotalMoney));
    }
        public void showMostAccounts () {
            String tempName = "";
            Double tempAccountCount = 0.0;
            //hier word er door de bankrecord lijst geloopt en word een functie gebruikt die de size van de hashmap weergeeft. meer is groter en word opgeslagen
            for (AccountHolder acc : bankRecord.getAccountHolderList()) {
                if (acc.accountCount() > tempAccountCount) {
                    tempAccountCount = acc.accountCount();
                    tempName = acc.getHolderName();
                }
            }
            System.out.println(tempName + " " + tempAccountCount.toString());
        }
    }

