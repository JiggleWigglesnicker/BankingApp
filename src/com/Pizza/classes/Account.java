package com.Pizza.classes;

import java.util.HashSet;
import java.util.Scanner;

public class Account {
    private String accountName;
    private HashSet<Currency> multiCurrenciesList;
    private double tradeInRate;
    private double tradeOutRate;
    Account(){

    }

    public String getAccountName(){
        return null;
    }

    public HashSet<Currency> getMultiCurrenciesList() {
        return multiCurrenciesList;
    }

    //moeten nog meer cases bij, met daarbij cases, maar eerst ff samen kijken
    public void conversion (String currency1, String currency2, Double amount){
        switch(currency1) {
            case "Euro":
                this.tradeInRate = Euro.getRate();
                switch (currency2) {
                    case "Yen":
                        this.tradeOutRate = Yen.getRate();
                }
        }
    }

    public void addCurrency(Currency currency){

    }
/*

    public void exchangeMoney(){
        System.out.print("Enter the currency you want to get");
        Scanner wantedCurrency = new Scanner(System.in);

        System.out.print("Enter the currency you want to trade in");
        Scanner unwantedCurrency = new Scanner(System.in);

        System.out.print("Enter the amount of "+unwantedCurrency+" you wish to exchange");
        Scanner exchangeAmount = new Scanner(System.in);


        }
    }
*/
}
