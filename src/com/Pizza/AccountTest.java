package com.Pizza;

import org.junit.jupiter.api.Test;

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

    @Test
    void conversion() {
        Double amount2 = 0.0;
        String cur1 = "Euro";
        String cur2 = "Yen";
        Euro euro1 = new Euro("Euro", 23.0, 0.81);
        Yen yen1 = new Yen("Yen", 2300.0, 120.0);
        Dollar dollar1 = new Dollar("Dollar" , 50.0, 1.0);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        account1.addCurrency(yen1);
        account1.addCurrency(dollar1);
        account1.conversion(cur1,cur2,2200.0);
        for(Currency cur : account1.getMultiCurrenciesList()){
            if(cur.getCurrencyName() == cur2){
                amount2 = cur.getAmount();
            }
        }
        assertEquals(4500.0,amount2);
    }
}