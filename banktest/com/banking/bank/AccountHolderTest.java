package com.banking.bank;

import com.banking.currency.Dollar;
import com.banking.currency.Euro;
import com.banking.currency.Yen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountHolderTest {

    //test if accounts are properly counted and return
    @Test
    void accountCount() {
        Account account1 = new Account("TrustFund1");
        Account account2 = new Account("TrustFund2");
        Account account3 = new Account("TrustFund1");
        Account account4 = new Account("TrustFund2");
        AccountHolder holder1 = new AccountHolder("honk");
        holder1.addAccount(account1);
        holder1.addAccount(account2);
        holder1.addAccount(account3);
        holder1.addAccount(account4);
        assertEquals(4, holder1.accountCount());
    }

    // gets the rate of the correct currency type
    @Test
    void getRate() {
        Euro euro1 = new Euro(230.0);
        Yen yen1 = new Yen(230.0);
        Account account1 = new Account("TrustFund1");
        Account account2 = new Account("TrustFund2");
        account1.addCurrency(euro1);
        account2.addCurrency(yen1);
        AccountHolder holder1 = new AccountHolder("honk");
        holder1.addAccount(account1);
        holder1.addAccount(account2);
        Double rate = holder1.getRate("Euro");
        assertEquals(0.81, rate);
    }

    //test of total amount of all accounts is properly returned in dollars
    @Test
    void calcTotalAmountHolder() {
        Euro euro1 = new Euro(23.0);
        Yen yen1 = new Yen(2300.0);
        Account account1 = new Account("TrustFund1");
        Account account2 = new Account("TrustFund2");
        account1.addCurrency(euro1);
        account2.addCurrency(yen1);
        AccountHolder holder1 = new AccountHolder("honk");
        holder1.addAccount(account1);
        holder1.addAccount(account2);
        assertEquals(41.63, holder1.calcTotalAmountHolder());
    }

    //test of accounts are added properly
    @Test
    void addAccount() {
        Account account1 = new Account("TrustFund1");
        Account account2 = new Account("TrustFund2");
        Account account3 = new Account("TrustFund3");
        Account account4 = new Account("TrustFund3");
        AccountHolder holder1 = new AccountHolder("Hank");
        holder1.addAccount(account1);
        holder1.addAccount(account2);
        holder1.addAccount(account3);
        holder1.addAccount(account4);
        var setSize = holder1.getAccountList().size();
        assertEquals(4, setSize);
    }
}