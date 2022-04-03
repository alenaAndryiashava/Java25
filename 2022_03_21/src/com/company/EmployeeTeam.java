package com.company;

import java.util.Arrays;

//Let’s create new class EmployeeTeam that should handle the array of Employees.
// This class should have private field array of Employees and implements toString(),
// add(Employee employee) method and remove(int index) method.
public class EmployeeTeam {
    private  int capacity = 5;
    private int currentIndex = 0;
    private Employee[] employees;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Team: \n");
        for (int i = 0; i <currentIndex ; i++) {
            stringBuilder.append(employees[i]).append("\n");
        }

        return stringBuilder.toString();
    }

    public void add(Employee employee){
        if(employees == null){
            employees = new Employee[capacity];
            currentIndex = 0;
        }
        if(currentIndex>=capacity){
            capacity*=2;
            employees = Arrays.copyOf(employees,capacity);
        }
        employees[currentIndex++]=employee;
    }

    public void remove(int index){
        System.arraycopy(employees,index+1,employees,index,capacity-1-index);
        currentIndex--;
    }

    public Employee[] getTeam() {
        return employees;
    }
}
