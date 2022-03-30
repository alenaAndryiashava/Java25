package com.company;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name: " + name + "; salary = " + salary;
    }

    public void getPaid(){
        System.out.println("I got the paid " + getSalary());
    }

    public abstract void doWork();

}
