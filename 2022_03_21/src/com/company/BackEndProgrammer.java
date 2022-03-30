package com.company;

public class BackEndProgrammer extends Programmer{

    public BackEndProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "BackEnd " +  super.toString();
    }

    public void doWork(){
        System.out.println("I am programmer " + getName() + ", Write code and improve backend.");
    }
}
