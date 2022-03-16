package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Ivan","Ivanov");
        Person person2 = new Person("Petr","Petrov");

	    Account account1 = new Account("DE89 3704 0044 0532 0130 00",person1,340.45);
        Account account2 = new Account("DE66 3640 0944 0592 0130 05",person2,1000.23);

        BankProcessing bankProcessing = new BankProcessing(new Account[]{account1,account2});

        System.out.println(account1.getsecureIban());
        System.out.println(Arrays.toString(bankProcessing.getClients()));
        System.out.println(bankProcessing.secureToString()) ;
        bankProcessing.printTotalBalance();
    }
    //Implement a simple bank app

}
