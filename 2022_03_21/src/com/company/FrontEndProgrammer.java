package com.company;

public class FrontEndProgrammer extends Programmer{

    public FrontEndProgrammer(String name, double salary) {
        super(name, salary);

    }

    @Override
    public String toString() {
        return "FrontEnd " + super.toString();
    }

    public void doWork(){
        System.out.println("I am programmer " + getName() + ", I write code and implement new features." );
    }
}
