package com.company;

import java.util.Arrays;

public class BankProcessing {
    private Account[] bankAccounts;

    public BankProcessing(Account[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public String toString() {
        return "BankProcessing: " +
                "bankAccounts: " + Arrays.toString(bankAccounts);

    }

    public String secureToString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bankAccounts.length ; i++) {
            stringBuilder.append(bankAccounts[i].secureToString());
        }
        return  "BankProcessing: " + '\n'+
                "bankAccounts: " +'\n'+ stringBuilder.toString();
    }

    public Person[] getClients() {
        Person[] clients = new Person[bankAccounts.length];
        for (int i = 0; i < bankAccounts.length; i++) {
            clients[i] = bankAccounts[i].getClient();
        }
        return clients;

    }
    public double getSumOfAllAccounts(){
        double sum = 0;
        for (int i = 0; i < bankAccounts.length; i++) {
             sum += bankAccounts[i].getBalance();
        }
        return sum;
    }
    public void printTotalBalance(){
        System.out.println("Total balance: " + getSumOfAllAccounts());
    }
}

//c. Create BankProcessing class with an attribute Account[] bankAccounts.
//   Write a constructor, which takes an array of Accounts as argument.
//   Write toString method. Write the method witch return the array of all of the bank clients.

//e. In the BankProcessing implement the secureToString method which displays
//  the accounts using Account. secureToString method.

//f. In the BankProcessing implement the method which
//   returns the sum of all accounts balances.
