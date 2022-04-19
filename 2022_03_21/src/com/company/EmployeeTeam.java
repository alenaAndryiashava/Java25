package com.company;

import java.util.Arrays;

//Let’s create new class EmployeeTeam that should handle the array of Employees.
// This class should have private field array of Employees and implements toString(),
// add(Employee employee) method and remove(int index) method.
public class EmployeeTeam {
    private int capacity =5;
    private int currentIndex = 0;
    private Employee[] employees;

    public EmployeeTeam(int capacity) {
        this.capacity = capacity;
    }

    public EmployeeTeam() {
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Team: \n");
        for (int i = 0; i < currentIndex; i++) {
            stringBuilder.append(employees[i]).append("\n");
        }

        return stringBuilder.toString();
    }

    public void add(Employee employee) {
        if (employees == null) {
            employees = new Employee[capacity];
            currentIndex = 0;
        }
        if (currentIndex >= capacity) {
            capacity *= 2;
            employees = Arrays.copyOf(employees, capacity);
        }
        employees[currentIndex++] = employee;
    }

    public void remove(int index) {
        if (currentIndex > 0 && index <= currentIndex) {
            System.arraycopy(employees, index + 1, employees, index, capacity - 1 - index);
            currentIndex--;
        }
    }
    public void remove(int index, boolean flag){
        if (flag){
            System.out.println("Remove element " + index);
        }
    }

    public Employee[] getTeam() {
        return employees;
    }
    public int find(Employee employee) {
        if (employee != null)
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i].hashCode() == employee.hashCode() &&
            employees[i].equals(employee))
                return i;
            }
       return -1;
    }
    public int findByName(String name) {
            for (int i = 0; i < currentIndex; i++) {
                if (employees[i].getName().equals(name))
                    return i;
            }
        return -1;
    }

    public void remove (Employee employee){
        int index = this.find(employee);
        if(index!= -1){
            this.remove(index);
        }
    }
    //The remove (String name) method that remove Employees by the name
    public void remove (String name){
        int index = findByName(name);
        if(index == -1)
            System.out.println("The employee " + name + " is not in the team.");
        else
            remove(index);
    }
    //The int size() method that returns how many Employees in the team
    public int size(){
        return currentIndex;
    }
    //The Employee get(int index) method that return
    // the Employee with the given index

    Employee get(int index){
        if(index<0 || index>=capacity)
            return null;

        return employees[index];
    }
    //Removal of several employees from the team at once (removeAll)
    // It should be possible to use an array of Employee
    // or EmployeeTeam to set the list of removed workers

    public void removeAll(Employee[] employees){
        for (Employee employee : employees) {
            remove(employee);
        }
    }
    //Adding several employees to a team at a time (addAll).
    // As previous It should be possible to set the list by array or by EmployeeTeam
    public void addAll(Employee[] employees){
        for (Employee employee : employees) {
            add(employee);
        }
    }
    //Since our EmployeeTeam allows null cells at the end of the array,
    // it could take up extra memory. Implement the trimToSize() method that trims
    // the capacity of the array to be the real current size.

    public void trimToSize(){
        this.employees = Arrays.copyOf(employees,currentIndex);
        capacity = currentIndex;

    }
}

