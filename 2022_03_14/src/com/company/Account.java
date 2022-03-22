package com.company;

import java.util.Arrays;

public class Account {
    private String IBAN;
    private Person client;
    private double balance;

    public Account(String IBAN, Person client, double balance) {
        this.IBAN = IBAN;
        this.client = client;
        this.balance = balance;
    }

    public String toString() {
        return "Account:" +
                "IBAN = " + IBAN + " " +
                ", client: " + client +
                ", balance = " + balance;
    }
    public String secureToString(){
        return "Account: " +
                "IBAN: " + getsecureIban() + ", " +
                " client: " + client + ", "+
                " balance = " + balance+"\n";
    }

    public String getIBAN() {
        return IBAN;
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    public String getsecureIban(){
        String prefix = IBAN.substring(0, 4);
        String postfix = IBAN.substring(IBAN.length()-3);
        char[] stars = new char[IBAN.length()-6];
        Arrays.fill(stars, '*');
        return prefix + String.valueOf(stars) + postfix;
    }

}

//b. Create Account class with the following attributes String IBAN, Person client, double balance.
// Write constructor, toString and getters methods.

//d. In the Account class write secureToString method which works like normal toString
// but instead IBAN put in the result string something like DE45 *********35
// (replaces all characters of IBAN string to char ‘’ except four first and two last characters).