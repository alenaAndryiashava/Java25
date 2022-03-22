package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Ivanov", 1000);
        Programmer programmer2 = new Programmer("Petrov", 1500);
        QAEngineer qaEngineer1 = new QAEngineer("Pavlov", 1200);
        QAEngineer qaEngineer2 = new QAEngineer("Maximov", 1100);
        Intern intern = new Intern("Aleksov", 200);
        Manager manager1 = new Manager("Nemov",1900,200);

        Employee[] employees = {manager1,programmer1, programmer2, qaEngineer1, qaEngineer2, intern};
        for (Employee employee : employees) {
            System.out.println(employee);
            employee.doWork();
            employee.getPaid();


        }

    }

}
