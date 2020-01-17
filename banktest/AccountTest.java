import com.banking.bank.Account;
import com.banking.currency.Currency;
import com.banking.currency.Dollar;
import com.banking.currency.Euro;
import com.banking.currency.Yen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void addCurrency() {
        Euro euro1 = new Euro(23.0);
        Euro euro2 = new Euro(23.0);
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
        Euro euro1 = new Euro(23.0);
        Yen yen1 = new Yen(2300.0);
        Dollar dollar1 = new Dollar(50.0);
        Account account1 = new Account("TrustFund");
        account1.addCurrency(euro1);
        account1.addCurrency(yen1);
        account1.addCurrency(dollar1);
        account1.conversion(cur1,cur2,2200.0);
        //TODO : for loop om currency op te halen in methode doen in account class
        for(Currency cur : account1.getMultiCurrenciesList()){
            if(cur.getCurrencyName() == cur2){
                amount2 = cur.getAmount();
            }
        }
        assertEquals(4500.0,amount2);
    }
}