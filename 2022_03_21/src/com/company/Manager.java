package com.company;
//Create a Manager class. Manager is the employee too.
// In addition to the salary, the manager has a bonus.
// The getPaid method of Manager should consider the bonus.
public class Manager extends Employee{
    private Employee[] team;
    private double bonus;

    public Manager(String name, double salary, double bonus){
        super(name,salary);
        this.team = new Employee[0];
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager: " + "\n" + super.toString() + "; bonus = " + bonus;
    }

    public Employee[] getTeam() {
        return team;
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

    public void addEmployeeToTeam(Employee employee){
        Employee[] newTeam = new Employee[team.length + 1];
        for (int i = 0; i < team.length; i++) {
            newTeam[i] = team[i];
        }
        newTeam[team.length] = employee;
        this.team = newTeam;
    }
}