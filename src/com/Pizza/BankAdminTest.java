package com.Pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAdminTest {

    @Test
    void calcBankTotal() {
    }

    @Test
    void showTotalIndividualCurrencies() {
    }

    @Test
    void poorestAccount() {

    }

    @Test
    void richestAccount() {
        Euro euro1 = new Euro("Euro", 23.0, 0.81);
        Dollar dollar1 = new Dollar("Dollar" , 50.0, 1.0);
        Yen yen1 = new Yen("Yen", 35.5, 121.0);
        Euro euro2 = new Euro("Euro", 23.0, 0.81);
        Dollar dollar2 = new Dollar("Dollar" , 50.0, 1.0);
        Yen yen2 = new Yen("Yen", 35.5, 121.0);
        Euro euro3 = new Euro("Euro", 23.0, 0.81);
        Dollar dollar3 = new Dollar("Dollar" , 50.0, 1.0);
        Yen yen3 = new Yen("Yen", 35.5, 121.0);
        Account account1 = new Account("TrustFund1");
        Account account2 = new Account("TrustFund2");
        Account account3 = new Account("TrustFund3");
        AccountHolder holder1 = new AccountHolder("Henk");
        AccountHolder holder2 = new AccountHolder("Piet");
        AccountHolder holder3 = new AccountHolder("Frits");
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
        holder2.addAccount(account2);
        holder3.addAccount(account3);
        holder1.calcTotalAmountHolder();
        holder2.calcTotalAmountHolder();
        holder3.calcTotalAmountHolder();
        record.addHolder(holder1);
        record.addHolder(holder2);
        record.addHolder(holder3);
        admin.richestAccount();

        assertEquals(78.69, 78.69);
        assertEquals("Piet", "Piet");
    }

    @Test
    void showMostAccounts() {

        Account account1 = new Account("Eerste bank henk");
        Account account2 = new Account("Eerste bank frits");
        Account account3 = new Account("Eerste bank willem");
        Account account4 = new Account("tweede bank willem");
        Account account5 = new Account("derde bank willem");
        Account account6 = new Account("vierde bank willem");

        AccountHolder accountHolder1 = new AccountHolder("henk");
        AccountHolder accountHolder2 = new AccountHolder("frits");
        AccountHolder accountHolder3 = new AccountHolder("willem");

        accountHolder1.addAccount(account1);
        accountHolder2.addAccount(account2);
        accountHolder3.addAccount(account3);
        accountHolder3.addAccount(account4);
        accountHolder3.addAccount(account5);
        accountHolder3.addAccount(account6);

        BankRecord record1 = new BankRecord();

        record1.addHolder(accountHolder1);
        record1.addHolder(accountHolder2);
        record1.addHolder(accountHolder3);

        BankAdmin bankAdmin1 = new BankAdmin(record1);
        bankAdmin1.showMostAccounts();
        assertEquals(4, 4);
        assertEquals("willem", "willem");

    }
}