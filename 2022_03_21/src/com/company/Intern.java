package com.company;

public class Intern extends Employee{
    public Intern(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String toString() {
        return "Intern: " + "\n" + super.toString();
    }

    @Override
    public void doWork() {

    }

    public void qwe(){
        System.out.println("Qwe!!!");
    }
}
