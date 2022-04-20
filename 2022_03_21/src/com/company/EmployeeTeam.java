package com.company;

import java.util.Arrays;

//Let’s create new class EmployeeTeam that should handle the array of Employees.
// This class should have private field array of Employees and implements toString(),
// add(Employee employee) method and remove(int index) method.
public class EmployeeTeam {
    private int capacity =5;
    private int currentIndex = 0;
    private Employee[] team;

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
            stringBuilder.append(team[i]).append("\n");
        }

        return stringBuilder.toString();
    }

    public void add(Employee employee) {
        if (team == null) {
            team = new Employee[capacity];
            currentIndex = 0;
        }
        if (currentIndex >= capacity) {
            capacity *= 2;
            team = Arrays.copyOf(team, capacity);
        }
        team[currentIndex++] = employee;
    }

    public void remove(int index) {
        if (currentIndex > 0 && index <= currentIndex) {
            System.arraycopy(team, index + 1, team, index, capacity - 1 - index);
            currentIndex--;
        }
    }
    public void remove(int index, boolean flag){
        if (flag){
            System.out.println("Remove element " + index);
        }
    }

    public Employee[] getTeam() {
        return team;
    }
    public int find(Employee employee) {
        if (employee != null)
        for (int i = 0; i < currentIndex; i++) {
            if (team[i].hashCode() == employee.hashCode() &&
            team[i].equals(employee))
                return i;
            }
       return -1;
    }
    public int findByName(String name) {
            for (int i = 0; i < currentIndex; i++) {
                if (team[i].getName().equals(name))
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
    //3. The remove (String name) method that remove Employees by the name
    public void remove (String name){
        int index = findByName(name);
        if(index == -1)
            System.out.println("The employee " + name + " is not in the team.");
        else
            remove(index);
    }
    //1. The int size() method that returns how many Employees in the team
    public int size(){
        return currentIndex;
    }
    //2. The Employee get(int index) method that return
    // the Employee with the given index

    public Employee get(int index){
        if(index<0 || index >= currentIndex)
            return null;

        return team[index];
    }
    //4. Removal of several employees from the team at once (removeAll)
    // It should be possible to use an array of Employee
    // or EmployeeTeam to set the list of removed workers

    public boolean removeAll(Employee[] employees) {
        if (employees == null) return false;
        int size = size();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                remove(employees[i]);
            }
        }
        return size != size();
    }

    public boolean removeAll(EmployeeTeam employees) {
        if (employees == null) return false;
        int size = size();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = get(i);
                if(employee!=null){
                    remove(employee);
            }
        }
        return size != size();
    }


    //5. Adding several employees to a team at a time (addAll).
    // As previous It should be possible to set the list by array or by EmployeeTeam
    public boolean addAll(Employee[] employees) {
        if (employees == null) return false;
        int size = size();
        int newCapacity = currentIndex + employees.length+10;
        if (newCapacity<capacity){
            increaseToSize(newCapacity);
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                add(employees[i]);
            }
        }
        return size != size();
    }

    public boolean addAll(EmployeeTeam employees) {
        if (employees != null) {
            return addAll(employees.getTeam());
        } else {
            return false;
        }
    }

    private void increaseToSize(int newCapacity){
        if(newCapacity>capacity){
            team = Arrays.copyOf(team,newCapacity);
            capacity = newCapacity;
        }
    }
    // 6. Since our EmployeeTeam allows null cells at the end of the array,
    // it could take up extra memory. Implement the trimToSize() method that trims
    // the capacity of the array to be the real current size.

    public void trimToSize(){
        if(capacity>currentIndex) {
            this.team = Arrays.copyOf(team, currentIndex);
            capacity = currentIndex;
        }
    }

    //7. The method that returns the new EmployeeTeam with all
    // employees with the given name from this team .

    public EmployeeTeam findAllByName(String name){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        if (name==null) return employeeTeam;
        for (int i = 0; i < currentIndex; i++) {
            if(team[i].getName().equals(name)){
                employeeTeam.add(team[i]);
            }
        }
        return employeeTeam;
    }

    // Implement the method that returns the EmployeeTeam with all programmers
    // or all QA Engineers from this team

    public EmployeeTeam findAllBySpeciality (String name) {
        EmployeeTeam employeeTeam = new EmployeeTeam();
        if (name == null) return employeeTeam;
        for (int i = 0; i < currentIndex; i++) {
            switch (name) {
                case "programmer":
                    if (team[i] instanceof Programmer) add(team[i]);
                case "qa":
                    if (team[i] instanceof QAEngineer) add(team[i]);
            }
        }
        return employeeTeam;
    }

}

