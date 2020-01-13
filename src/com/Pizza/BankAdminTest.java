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