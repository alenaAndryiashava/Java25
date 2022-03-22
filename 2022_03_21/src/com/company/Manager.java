package com.company;
//Create a Manager class. Manager is the employee too.
// In addition to the salary, the manager has a bonus.
// The getPaid method of Manager should consider the bonus.
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager: " +"\n"+ super.toString() + "; bonus = " + bonus;


    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+getBonus();
    }
}
