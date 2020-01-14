package com.Pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountHolderTest {

    @Test
    void addAccount() {
        Account account1 = new Account("TrustFund1");
        Account account2 = new Account("TrustFund2");
        Account account3 = new Account("TrustFund3");
        Account account4 = new Account("TrustFund3");
        AccountHolder holder1 = new AccountHolder("Henk");
        holder1.addAccount(account1);
        holder1.addAccount(account2);
        holder1.addAccount(account3);
        holder1.addAccount(account4);
        var setSize = holder1.getAccountList().size();
        assertEquals(4,setSize);
    }
}