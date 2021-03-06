package com.company;

public class Student implements TaskObserver{
    private String name;
    private int yearOfBirthday;
    private double gpa;

    public Student(String name, int yearOfBirthday, double gpa) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "[Student: " +
                name +"; "+ yearOfBirthday +
                "; " + gpa +
                ']';
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void handleEvent(Task task) {
        System.out.println("Ok. Task is in progress.");
    }
}
