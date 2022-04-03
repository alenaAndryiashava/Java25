package com.company;

import java.util.Arrays;

//Create a Manager class. Manager is the employee too.
// In addition to the salary, the manager has a bonus.
// The getPaid method of Manager should consider the bonus.
public class Manager extends Employee{
    private final EmployeeTeam employeeTeam;
    private final double bonus;

    public Manager(String name, double salary, double bonus){
        super(name,salary);
        this.employeeTeam = new EmployeeTeam();
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager: " + "\n" + super.toString() + "; bonus = " + bonus;
    }

    public EmployeeTeam getTeam() {
        return employeeTeam;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+getBonus();
    }

    public void doWork(){
        System.out.println("I am manager " + getName() + ", I get highest salary.");
    }
}
