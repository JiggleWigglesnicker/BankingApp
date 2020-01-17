package com.banking.bank;

import com.banking.currency.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void checkIfSufficientFunds() {

    }

    @Test
    void conversion() {

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