package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTeamTest {
        EmployeeTeam employeeTeam = new EmployeeTeam(5);
        QAEngineer qaEngineer = new QAEngineer(1,"Pavlov", 1200);
        BackEndProgrammer backEndProgrammer = new BackEndProgrammer(2,"Sergeev", 1300);
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer(3,"Vasilev", 1400);

    @Test
    void add() {
        employeeTeam.add(qaEngineer);
        employeeTeam.add(backEndProgrammer);
        employeeTeam.add(frontEndProgrammer);

        Employee[] expected = {qaEngineer, backEndProgrammer, frontEndProgrammer};
        Employee[] actual = employeeTeam.getTeam();

        assertArrayEquals(expected, actual);
    }

    @Test
    void remove() {
        employeeTeam.add(qaEngineer);
        employeeTeam.add(backEndProgrammer);
        employeeTeam.add(frontEndProgrammer);
        System.out.println(employeeTeam);
        employeeTeam.remove(0);
        System.out.println(employeeTeam);

        Employee[] expected = {backEndProgrammer, frontEndProgrammer};
        Employee[] actual = employeeTeam.getTeam();

        assertArrayEquals(expected, actual);
    }

    @Test
    void trimToSize() {
        employeeTeam.add(qaEngineer);
        employeeTeam.add(backEndProgrammer);
        employeeTeam.add(frontEndProgrammer);

        employeeTeam.trimToSize();
        Employee[] expected = {qaEngineer, backEndProgrammer, frontEndProgrammer};
        Employee[] actual = employeeTeam.getTeam();

        assertArrayEquals(expected, actual);
    }

    @Test
    void sortByName() {
        employeeTeam.add(frontEndProgrammer);//Vasilev
        employeeTeam.add(qaEngineer);//Pavlov
        employeeTeam.add(backEndProgrammer);//Sergeev

        Employee[] expected = {qaEngineer, backEndProgrammer, frontEndProgrammer};
        Employee[] actual = employeeTeam.sortByName();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getTeam() {
        employeeTeam.add(frontEndProgrammer);
        employeeTeam.add(qaEngineer);
        employeeTeam.add(backEndProgrammer);
        Employee[] expected = {frontEndProgrammer,qaEngineer, backEndProgrammer};
        Employee[] actual = employeeTeam.getTeam();
        assertArrayEquals(expected, actual);
    }
}