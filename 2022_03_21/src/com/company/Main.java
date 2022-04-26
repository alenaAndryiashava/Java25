package com.company;
//Let’s improve our employee project.
// Let’s add several type of programmers: BackEnd programmer, FrontEnd programmer and FullStack.
// All type of programmers should doWork() but BackEnd programmers
// should “Write code and improve backend”,
// FrontEnd programmers should “Write code and Implement new features”.
// The work of FullStack programmers not defined.

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


        System.out.println("----------");
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

        EmployeeTeam team1 = new EmployeeTeam(2);
        team1.add(manager1);
        team1.add(backEndProgrammer);
        team1.add(qaEngineer1);
        team1.add(fullStackProgrammer);
        team1.add(frontEndProgrammer);
        team1.add(backEndProgrammer1);
        System.out.println(team1);
        team1.remove(backEndProgrammer1);
        System.out.println(team1);
        System.out.println("In the team: " +team1.size() + " employees.");
        System.out.println(team1.get(2));
        System.out.println(team1.get(5));

        team1.remove("Pavlov");
        System.out.println(team1);
        team1.remove("Maximov");
        team1.removeAll(new Employee[]{frontEndProgrammer,fullStackProgrammer});
        System.out.println(team1);
        team1.addAll(new Employee[]{frontEndProgrammer,fullStackProgrammer});
        System.out.println(team1);





    }

}
