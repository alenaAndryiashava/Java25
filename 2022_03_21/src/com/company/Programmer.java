package com.company;

public abstract class Programmer extends Employee{

    public Programmer(String name,double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "programmer: " + super.toString();
    }

}
