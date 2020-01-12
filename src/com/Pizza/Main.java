package com.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        //Initialization of objects
        Euro euro1 = new Euro("Euro", 23.0, 0.81);
        Dollar dollar1 = new Dollar("Dollar" , 50.0, 1.0);
        Yen yen1 = new Yen("Yen", 35.5, 121.0);
        Account account1 = new Account("TrustFund");
        AccountHolder holder1 = new AccountHolder("Henk");
        BankRecord record = new BankRecord();
        BankAdmin admin = new BankAdmin(record);

        // Calling methods of objects
        account1.addCurrency(euro1);
        account1.addCurrency(yen1);
        account1.addCurrency(dollar1);
        holder1.addAccount(account1);
        record.addHolder(holder1);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("||==================================================||" +
                    "\n||Welcome to the Banking Administration application.||" +
                    "\n||==================================================|| \n");
            System.out.println("Please select an option." +
                    " \n-BankTotal [currencyType] \n-Show Individual Currencies \n-Show Richest \n-Show Poorest" +
                    " \n-Show Most Accounts \n-Exit\n");

            String action = "";
            while(action != "-Exit") {
                action = reader.readLine();

                switch (action) {
                    //TODO : heeft input nodig van user moet aangepast worden
                    case "-BankTotal [currencyType]":
                        admin.calcBankTotal("Yen");
                        break;
                    case "-Show Individual Currencies":
                        admin.showTotalIndividualCurrencies();
                        break;
                    case "-Show Richest":
                        admin.richestAccount();
                        break;
                    case "-Show Poorest":
                        admin.poorestAccount();
                        break;
                    case "-Show Most Accounts":
                        admin.showMostAccounts();
                        break;
                    case "-Exit": System.exit(1);
                        break;
                    default: System.out.println("Invalid Command");
                }
            }
        }catch (IOException e){
            System.out.println("line cant be read");
        }
    }
}
