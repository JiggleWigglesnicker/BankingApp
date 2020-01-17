package com.banking.bank;

import com.banking.currency.Euro;
import com.banking.currency.Yen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void checkIfSufficientFunds() {
        Euro euro1 = new Euro(23.0);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        Boolean enoughMoney = account1.checkIfSufficientFunds(euro1,23.0);
        assertEquals(true, enoughMoney);

    }

    @Test
    void conversion() {
        Euro euro1 = new Euro(23.0);
        Yen yen2 = new Yen(2300.0);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        account1.addCurrency(yen2);
        account1.conversion("Euro","Yen", 15.0);
        assertEquals(3950.0 , account1.getCurrency("Yen").getAmount());

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
}