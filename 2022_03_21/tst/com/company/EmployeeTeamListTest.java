package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTeamListTest {

    QAEngineer qaEngineer = new QAEngineer(1,"Pavlov", 1200);
    BackEndProgrammer backEndProgrammer = new BackEndProgrammer(2,"Sergeev", 1300);
    FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer(3,"Vasilev", 1400);
    Manager manager = new Manager(4,"Nemov", 1900, 200);
    FullStackProgrammer fullStackProgrammer = new FullStackProgrammer(7,"Borisov", 1300);
    EmployeeTeamList employeeTeamList = new EmployeeTeamList();

    @Test
    void add() {
        employeeTeamList.add(qaEngineer);
        employeeTeamList.add(backEndProgrammer);
        employeeTeamList.add(frontEndProgrammer);

        List<Employee> expected = Arrays.asList(qaEngineer, backEndProgrammer, frontEndProgrammer);
        List<Employee> actual = employeeTeamList.getTeam();

        assertEquals(expected, actual);
    }

    @Test
    void removeBySpecialty() {
        employeeTeamList.add(qaEngineer);
        employeeTeamList.add(backEndProgrammer);
        employeeTeamList.add(frontEndProgrammer);
        employeeTeamList.remove(qaEngineer);

        List<Employee> expected = Arrays.asList(backEndProgrammer, frontEndProgrammer);
        List<Employee> actual = employeeTeamList.getTeam();

        assertEquals(expected, actual);
    }

    @Test
    void testRemoveByIndex() {
        employeeTeamList.add(qaEngineer);
        employeeTeamList.add(backEndProgrammer);
        employeeTeamList.add(frontEndProgrammer);
        employeeTeamList.remove(0);

        List<Employee> expected = Arrays.asList(backEndProgrammer, frontEndProgrammer);
        List<Employee> actual = employeeTeamList.getTeam();

        assertEquals(expected, actual);
    }

    @Test
    void find() {
    }

    @Test
    void findByName() {
        employeeTeamList.add(qaEngineer);
        employeeTeamList.add(backEndProgrammer);
        employeeTeamList.add(frontEndProgrammer);

        Employee expected = qaEngineer;
        Employee actual = employeeTeamList.findByName("Pavlov");

        assertEquals(expected, actual);

    }

    @Test
    void testRemoveByName() {
        employeeTeamList.add(qaEngineer);
        employeeTeamList.add(backEndProgrammer);
        employeeTeamList.add(frontEndProgrammer);
        employeeTeamList.remove("Pavlov");

        List<Employee> expected = Arrays.asList(backEndProgrammer, frontEndProgrammer);
        List<Employee> actual = employeeTeamList.getTeam();

        assertEquals(expected, actual);
    }


    @Test
    void removeAll() {
        employeeTeamList.add(qaEngineer);
        employeeTeamList.add(backEndProgrammer);
        employeeTeamList.add(frontEndProgrammer);
        EmployeeTeamList employeeTeamList1 = new EmployeeTeamList();
        employeeTeamList1.add(backEndProgrammer);
        employeeTeamList1.add(frontEndProgrammer);
        employeeTeamList.removeAll(employeeTeamList1);

        List<Employee> expected = Arrays.asList(qaEngineer);
        List<Employee> actual = employeeTeamList.getTeam();

        assertEquals(expected, actual);

    }

    @Test
    void addAll() {
        EmployeeTeamList employeeTeamList1 = new EmployeeTeamList();
        employeeTeamList1.add(manager);
        employeeTeamList1.add(fullStackProgrammer);
        employeeTeamList1.add(frontEndProgrammer);
        EmployeeTeamList employeeTeamList = new EmployeeTeamList();
        employeeTeamList.addAll(employeeTeamList1);



        List<Employee> expected = Arrays.asList(manager,fullStackProgrammer,frontEndProgrammer);
        List<Employee> actual = employeeTeamList.getTeam();

        assertEquals(expected, actual);

    }

    @Test
    void findAllBySpeciality() {

    }

    @Test
    void sortByName() {
        employeeTeamList.add(frontEndProgrammer);//Vasilev
        employeeTeamList.add(qaEngineer);//Pavlov
        employeeTeamList.add(backEndProgrammer);//Sergeev

        List<Employee> expected = Arrays.asList(qaEngineer,backEndProgrammer, frontEndProgrammer);
        List<Employee> actual = employeeTeamList.sortByName();

        assertEquals(expected, actual);

    }
}