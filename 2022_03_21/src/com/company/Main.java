package com.company;
//Let’s improve our employee project.
// Let’s add several type of programmers: BackEnd programmer, FrontEnd programmer and FullStack.
// All type of programmers should doWork() but BackEnd programmers
// should “Write code and improve backend”,
// FrontEnd programmers should “Write code and Implement new features”.
// The work of FullStack programmers not defined.

import java.util.Arrays;

//Add to Manager field team. It must contain an array of Employee.
// You should not initialize it from constructor.
// You should implement the method addEmployeeToTeam
// that takes an Employee and add to team.
public class Main {

    public static void main(String[] args) {
        QAEngineer qaEngineer1 = new QAEngineer("Pavlov", 1200);
        QAEngineer qaEngineer2 = new QAEngineer("Maximov", 1100);
        Intern intern = new Intern("Aleksov", 200);
        Manager manager = new Manager("Nemov", 1900, 200);
        BackEndProgrammer backEndProgrammer = new BackEndProgrammer("Sergeev", 1300);
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer("Vasilev", 1400);
        FullStackProgrammer fullStackProgrammer = new FullStackProgrammer("Borisov", 1300);


        Employee[] employees = {manager, qaEngineer1, qaEngineer2, intern};
        for (Employee employee : employees) {
            System.out.println(employee);
            employee.doWork();
            employee.getPaid();
            intern.qwe();
        }

        /*
        manager.addEmployeeToTeam(backEndProgrammer);
        manager.addEmployeeToTeam(frontEndProgrammer);
        manager.addEmployeeToTeam(fullStackProgrammer);
        System.out.println("Team:");
        for (Employee employee : manager.getTeam()) {
            System.out.println(employee);
        }

         */
        System.out.println("----Manager------");
        Manager manager1 = new Manager("SuperBoss", 5000, 1000);

        manager1.getTeam().add(manager1);
        manager1.getTeam().add(qaEngineer1);
        manager1.getTeam().add(backEndProgrammer);
        manager1.getTeam().add(frontEndProgrammer);
        System.out.println(manager1.getTeam());
        manager1.getTeam().remove(1);
        System.out.println(manager1.getTeam());

        System.out.println(manager1.getTeam().find(backEndProgrammer));
        System.out.println(manager1.getTeam().find(qaEngineer2));


        BackEndProgrammer backEndProgrammer1 = new BackEndProgrammer("Sergeev", 1300);
        manager1.getTeam().remove(backEndProgrammer1);
        System.out.println(manager1.getTeam());

        EmployeeTeam team = new EmployeeTeam(10);
        team.add(manager1);
        team.add(backEndProgrammer);
        team.add(qaEngineer1);
        System.out.println(team);
        team.remove(backEndProgrammer1);
        System.out.println(team);



    }

}
