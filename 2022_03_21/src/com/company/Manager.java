package com.company;

import java.util.Arrays;

//Create a Manager class. Manager is the employee too.
// In addition to the salary, the manager has a bonus.
// The getPaid method of Manager should consider the bonus.
public class Manager extends Employee{
    private final EmployeeTeam employeeTeam;
    private final double bonus;

    public Manager(int id, String name, double salary, double bonus){
        super(id, name,salary);
        this.employeeTeam = new EmployeeTeam();
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager: " + super.toString() + "; bonus = " + bonus;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(bonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
