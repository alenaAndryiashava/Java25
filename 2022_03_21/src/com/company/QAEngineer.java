package com.company;

public class QAEngineer extends Employee{

    public QAEngineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "QAEngineer: " + super.toString();
    }

    public void doWork(){
        System.out.println("I am QA Engineer " + getName() + ", I check the program.");
    }
}
