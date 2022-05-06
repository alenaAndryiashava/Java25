package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyDate[] myDates = {
                new MyDate(1,1,2000),
                new MyDate(10,1,2000),
                new MyDate(10,10,1999),
                new MyDate(2,2,2022),
        };

        System.out.println(Arrays.toString(myDates));
        Arrays.sort(myDates);
        System.out.println(Arrays.toString(myDates));
    }
}

