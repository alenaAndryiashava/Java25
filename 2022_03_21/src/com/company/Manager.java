package com.company;

import java.util.Arrays;

//Create a Manager class. Manager is the employee too.
// In addition to the salary, the manager has a bonus.
// The getPaid method of Manager should consider the bonus.
public class Manager extends Employee{
    private Employee[] team;
    private final double bonus;
    private  int capacity = 2;
    private int currentIndex=0;


    public Manager(String name, double salary, double bonus){
        super(name,salary);
        //this.team = new Employee[0];
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

    public void addEmployeeToTeam(Employee employee){ //добавление работника каждый раз вызывает
                                                      // создание нового массива.
        Employee[] newTeam = new Employee[team.length + 1];
        for (int i = 0; i < team.length; i++) {
            newTeam[i] = team[i];
        }
        newTeam[team.length] = employee;
        this.team = newTeam;
    }

    public void addToTeam(Employee employee){
        if(team == null){
            team = new Employee[capacity];
            currentIndex = 0;
        }
        if(currentIndex>=capacity){
            capacity*=2;
            team = Arrays.copyOf(team,capacity);

           /*
            Employee[] temp = new Employee[capacity*2];
            for (int i = 0; i <capacity ; i++) {
               temp[i] = team[i];
            }
            capacity*=2;
            team = temp;
            */

        }
        team[currentIndex++]=employee;

    }
    public void printTeam(){
        System.out.println("Team: ");
        for (int i = 0; i <currentIndex ; i++) {
            System.out.print(team[i] + "\n");
        }
        System.out.println();
    }
}
