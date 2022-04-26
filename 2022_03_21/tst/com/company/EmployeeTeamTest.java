package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTeamTest {


        EmployeeTeam employeeTeam = new EmployeeTeam(5);
        QAEngineer qaEngineer = new QAEngineer("Pavlov", 1200);
        BackEndProgrammer backEndProgrammer = new BackEndProgrammer("Sergeev", 1300);
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer("Vasilev", 1400);

    @Test
    void add() {
        employeeTeam.add(qaEngineer);
        employeeTeam.add(backEndProgrammer);
        employeeTeam.add(frontEndProgrammer);

        Employee[] expected = {qaEngineer, backEndProgrammer, frontEndProgrammer, null, null};
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

        Employee[] expected = {backEndProgrammer, frontEndProgrammer, null, null, null};
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
}