package com.banking.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankRecordTest {

    @Test
    void addHolder() {
        AccountHolder holder1 = new AccountHolder("Hank");
        AccountHolder holder2 = new AccountHolder("bob");
        AccountHolder holder3 = new AccountHolder("dirk");
        AccountHolder holder4 = new AccountHolder("jingle");
        BankRecord record = new BankRecord();
        record.addHolder(holder1);
        record.addHolder(holder2);
        record.addHolder(holder3);
        record.addHolder(holder4);
        int sizeSet = record.getAccountHolderList().size();
        assertEquals(4,sizeSet);
    }
}