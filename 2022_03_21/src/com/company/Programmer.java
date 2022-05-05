package com.company;

public abstract class Programmer extends Employee{

    public Programmer(int id,String name,double salary) {
        super(id,name, salary);
    }

    @Override
    public String toString() {
        return "programmer: " + super.toString();
    }

}
