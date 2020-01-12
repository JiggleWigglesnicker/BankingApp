package com.Pizza;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void addCurrency() {
        Euro euro1 = new Euro("Euro", 23.0, 0.81);
        Euro euro2 = new Euro("Euro", 23.0, 0.81);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        account1.addCurrency(euro2);
        var setSize = account1.getMultiCurrenciesList().size();
        assertEquals(2,setSize );
    }
}