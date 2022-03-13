package com.company;

public class MyDate {
    int day;
    int month;
    int year;

    public String toString() {
        return day +
                "-" + month +
                "-" + year;
    }
    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }
}
