package com.company;
//6. In the Employee you need to implement new feature assign a Task(id, status, description)
// to each Employee. Think how you can implement it.
// NOTE each employee can solve more than one task,
// and each task can be solved by more than one employee.
public abstract class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private int id;

    public Employee(int id,String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0)
            return false;

        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Employee other) {
        return getName().compareTo(other.getName());
    }
}
