package com.banking;

import com.banking.bank.Account;
import com.banking.bank.AccountHolder;
import com.banking.bank.BankAdmin;
import com.banking.bank.BankRecord;
import com.banking.currency.Dollar;
import com.banking.currency.Euro;
import com.banking.currency.Yen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        //Initialization of objects
        Euro euro1 = new Euro(23.0);
        Dollar dollar1 = new Dollar(50.0);
        Yen yen1 = new Yen(35.5);
        Euro euro2 = new Euro(23.0);
        Dollar dollar2 = new Dollar(50.0);
        Yen yen2 = new Yen(35.5);
        Euro euro3 = new Euro(23.0);
        Dollar dollar3 = new Dollar(50.0);
        Yen yen3 = new Yen(35.5);
        Account account1 = new Account("TrustFund1");
        Account account2 = new Account("TrustFund2");
        Account account3 = new Account("TrustFund3");
        AccountHolder holder1 = new AccountHolder("Henk");
        AccountHolder holder2 = new AccountHolder("bob");
        AccountHolder holder3 = new AccountHolder("Dark");
        BankRecord record = new BankRecord();
        BankAdmin admin = new BankAdmin(record);

        // Calling methods of objects
        account1.addCurrency(euro1);
        account1.addCurrency(yen1);
        account1.addCurrency(dollar1);
        account2.addCurrency(euro2);
        account2.addCurrency(yen2);
        account2.addCurrency(dollar2);
        account3.addCurrency(dollar3);
        account3.addCurrency(yen3);
        account3.addCurrency(euro3);

        holder1.addAccount(account1);
        holder1.addAccount(account2);
        holder3.addAccount(account3);
        holder1.calcTotalAmountHolder();
        holder2.calcTotalAmountHolder();
        holder3.calcTotalAmountHolder();
        holder1.addUpIndividualAccountCurrencies();
        holder2.addUpIndividualAccountCurrencies();
        holder3.addUpIndividualAccountCurrencies();
        record.addHolder(holder1);
        record.addHolder(holder2);
        record.addHolder(holder3);
        record.calcRecordTotalIndividualCurrencies();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("||==================================================||" +
                    "\n||Welcome to the Banking Administration application.||" +
                    "\n||==================================================|| \n");
            System.out.println("Please select an option." +
                    " \n-BankTotal [Yen/Dollar/Euro] \n-Show Individual Currencies \n-Show Richest \n-Show Poorest" +
                    " \n-Show Most Accounts \n-Exit\n");

            String action = "";
            while (action != "-Exit") {
                action = reader.readLine();

                switch (action) {

                    case "-BankTotal Yen":
                        admin.calcBankTotal("Yen");
                        break;
                    case "-BankTotal Dollar":
                        admin.calcBankTotal("Dollar");
                        break;
                    case "-BankTotal Euro":
                        admin.calcBankTotal("Euro");
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
                    case "-Exit":
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Invalid Command");
                }
            }
        } catch (IOException e) {
            System.out.println("line cant be read");
        }
    }
}
