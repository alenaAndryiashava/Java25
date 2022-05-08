package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeTeamList implements EmployeeTeamService{
    private List<Employee> team;

    public EmployeeTeamList() {
        this.team = new LinkedList<>();
    }

    public List<Employee> getTeam() {
        return team;
    }

    public void add(Employee employee) {
        team.add(employee);
    }

    public Employee getEmployee(int index) {
        return team.get(index);
    }

    public void remove(int index) {
        team.remove(index);
    }

    public void remove (Employee employee){
        team.remove(employee);
    }

    public int size(){
        return team.size();
    }

    public int find(Employee employee) {
        if (employee != null)
            for (int i = 0; i < team.size(); i++) {
                if (team.get(i).hashCode() == employee.hashCode() &&
                        team.get(i).equals(employee))
                    return i;
            }
        return -1;
    }

    public Employee findByName(String name) {
        for (Employee employee:team) {
            if (employee.getName().equals(name))
                return employee;
        }
        return null;
    }

    //3. The remove (String name) method that remove Employees by the name
    public void remove (String name){
        Employee employee = findByName(name);
        if(employee != null) {
            remove(employee);
        }
    }

        public boolean removeAll(EmployeeTeamList employees) {
            if (employees == null) return false;
            int size = size();
            for (int i = 0; i < employees.size(); i++) {
                Employee employee = employees.getEmployee(i);
                if(employee!=null){
                    remove(employee);
                }
            }
            return size != size();
        }

        //5. Adding several employees to a team at a time (addAll).
        // As previous It should be possible to set the list by array or by EmployeeTeam
        public boolean addAll(EmployeeTeamList employees) {
            if (employees == null) return false;
            for (Employee employee: employees.getTeam()) {
                if (employee != null) {
                    add(employee);
                }
            }
            return true;
        }

        /* TODO
        Implement the method that returns the EmployeeTeam with all programmers
        // or all QA Engineers from this team

        public EmployeeTeam findAllBySpeciality (String name) {
            EmployeeTeam employeeTeam = new EmployeeTeam();
            if (name == null) return employeeTeam;
            for (int i = 0; i < team.size(); i++) {
                switch (name) {
                    case "programmer":
                        if (team.get(i) instanceof Programmer) add(team.get(i));
                    case "qa":
                        if (team.get(i) instanceof QAEngineer) add(team.get(i));
                }
            }
            return employeeTeam;
        }

         */

        //Add to the EmployeeTeam the ability to sort employees by name.
        // Use the Comparable and Arrays.sort
        public List<Employee> sortByName() {
            List<Employee> sortTeam = new LinkedList<>(team);
            sortTeam.sort(Comparator.comparing(Employee::getName));
            return sortTeam;
        }
    }

