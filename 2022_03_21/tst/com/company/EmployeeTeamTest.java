package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTeamTest {

    @Test
    void add() {
        EmployeeTeam employeeTeam = new EmployeeTeam();
        QAEngineer qaEngineer = new QAEngineer("Pavlov", 1200);
        BackEndProgrammer backEndProgrammer = new BackEndProgrammer("Sergeev", 1300);
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer("Vasilev", 1400);

        employeeTeam.add(qaEngineer);
        employeeTeam.add(backEndProgrammer);
        employeeTeam.add(frontEndProgrammer);

        Employee[] expected = {qaEngineer, backEndProgrammer, frontEndProgrammer, null, null};
        Employee[] actual = employeeTeam.getTeam();

        assertArrayEquals(expected, actual);
    }

    @Test
    void remove() {
        EmployeeTeam employeeTeam = new EmployeeTeam();
        QAEngineer qaEngineer = new QAEngineer("Pavlov", 1200);
        BackEndProgrammer backEndProgrammer = new BackEndProgrammer("Sergeev", 1300);
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer("Vasilev", 1400);

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
}