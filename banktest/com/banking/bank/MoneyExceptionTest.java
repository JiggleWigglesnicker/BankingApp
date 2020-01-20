package com.banking.bank;

import com.banking.currency.Euro;
import com.banking.currency.Yen;
import com.banking.exception.MoneyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MoneyExceptionTest {

    // If not enough funds are available for conversion throws MoneyException
    @Test
    void testMoneyException() {
        Assertions.assertThrows(MoneyException.class, () -> {
            Euro euro1 = new Euro(3.0);
            Yen yen1 = new Yen(230.0);
            Account account1 = new Account("TrustFund");
            account1.addCurrency(euro1);
            account1.addCurrency(yen1);
            account1.conversion(euro1, yen1, 15.0);
        });
    }
}