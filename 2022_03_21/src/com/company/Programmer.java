package com.company;

public class Programmer extends Employee{

    public Programmer(String name,double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Programmer: "+"\n"+ super.toString();
    }

    public void doWork(){
        System.out.println("I am programmer " + getName() + ", I write program.");
    }
}
