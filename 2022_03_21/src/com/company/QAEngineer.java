package com.company;

public class QAEngineer extends Employee{

    public QAEngineer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String toString() {
        return "QAEngineer: " + super.toString();
    }

    public void doWork(){
        System.out.println("I am QA Engineer " + getName() + ", I check the program.");
    }
}
