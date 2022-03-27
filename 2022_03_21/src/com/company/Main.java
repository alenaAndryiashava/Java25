package com.company;
//Let’s improve our employee project.
// Let’s add several type of programmers: BackEnd programmer, FrontEnd programmer and FullStack.
// All type of programmers should doWork() but BackEnd programmers
// should “Write code and improve backend”,
// FrontEnd programmers should “Write code and Implement new features”.
// The work of FullStack programmers not defined.


import java.security.spec.ECPrivateKeySpec;
import java.util.Arrays;

//Add to Manager field team. It must contain an array of Employee.
// You should not initialize it from constructor.
// You should implement the method addEmployeeToTeam
// that takes an Employee and add to team.
public class Main {

    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Ivanov", 1000);
        Programmer programmer2 = new Programmer("Petrov", 1500);
        QAEngineer qaEngineer1 = new QAEngineer("Pavlov", 1200);
        QAEngineer qaEngineer2 = new QAEngineer("Maximov", 1100);
        Intern intern = new Intern("Aleksov", 200);
        Manager manager1 = new Manager("Nemov", 1900, 200);
        BackEndProgrammer backEndProgrammer = new BackEndProgrammer("Sergeev", 1300);
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer("Vasilev", 1400);
        FullStackProgrammer fullStackProgrammer = new FullStackProgrammer("Borisov", 1300);


        Employee[] employees = {manager1, programmer1,programmer2, qaEngineer1, qaEngineer2, intern};
        for (Employee employee : employees) {
            System.out.println(employee);
            employee.doWork();
            employee.getPaid();
            intern.qwe();
        }

        manager1.addEmployeeToTeam(backEndProgrammer);
        manager1.addEmployeeToTeam(frontEndProgrammer);
        manager1.addEmployeeToTeam(fullStackProgrammer);
        System.out.println("Team:");
        for (Employee employee : manager1.getTeam()) {
            System.out.println(employee);
        }
    }

}
