package com.banking.bank;

import com.banking.currency.Currency;
import com.banking.currency.Euro;
import com.banking.currency.Yen;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void checkIfSufficientFunds() {
        Euro euro1 = new Euro(23.0);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        Boolean enoughMoney = account1.checkIfSufficientFunds(euro1,23.0);
        assertTrue(enoughMoney);

    }

    @Test
    void conversion() {
        Euro euro1 = new Euro(23.0);
        Yen yen1 = new Yen(230.0);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        account1.addCurrency(yen1);
        account1.conversion(euro1,yen1, 15.0);
        assertEquals(8 , account1.getCurrency("Euro").getAmount());
        assertEquals(1445.0 , account1.getCurrency("Yen").getAmount());

    }

    @Test
    void addCurrency() {
        Euro euro1 = new Euro(23.0);
        Euro euro2 = new Euro(23.0);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        account1.addCurrency(euro2);
        var setSize = account1.getMultiCurrenciesList().size();
        assertEquals(2, setSize);
    }

    @Test
    void getCurrency() {
        Euro euro1 = new Euro(23.0);
        Euro euro2 = new Euro(23.0);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        account1.addCurrency(euro2);
        account1.getCurrency("Euro");
        assertEquals("Euro",account1.getCurrency("Euro").getCurrencyName());
    }

    @Test
    void totalAccountAmountInDollars() {
        Euro euro1 = new Euro(23.0);
        Yen yen1 = new Yen(2300.0);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        account1.addCurrency(yen1);
        account1.totalAccountAmountInDollars();
        Double amount =  account1.totalAccountAmountInDollars();
        assertEquals(41.63,amount);

    }
}