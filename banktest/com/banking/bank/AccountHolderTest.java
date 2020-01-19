package com.banking.bank;

import com.banking.currency.Euro;
import com.banking.currency.Yen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountHolderTest {

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
        Double rate =  holder1.getRate("Euro");
        assertEquals(0.81, rate );
    }

    //TODO: telt niet goed op
    @Test
    void calcTotalAmountHolder() {
        Euro euro1 = new Euro(230.0);
        Yen yen1 = new Yen(230.0);
        Account account1 = new Account("TrustFund1");
        Account account2 = new Account("TrustFund2");
        account1.addCurrency(euro1);
        account2.addCurrency(yen1);
        AccountHolder holder1 = new AccountHolder("honk");
        holder1.addAccount(account1);
        holder1.addAccount(account2);
        assertEquals(2300.0,holder1.calcTotalAmountHolder() );

    }

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
        assertEquals(4,setSize);
    }
}