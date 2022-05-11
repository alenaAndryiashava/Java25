package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person("Ivan");
    Person person2 = new Person("Oleg");
        System.out.println("Person.temp = 10");
        Person.staticVar = 10;


        System.out.println(person1);
        System.out.println(person2);
        System.out.println("Person.temp = 30");
        Person.staticVar = 30;
        person1.staticVar = 20+ person1.nonStaticVar;
        System.out.println(person2);
        System.out.println("2: "+ person1);

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(new Person("Peter"));
        System.out.println(list);

        Manager manager = Manager.getInstance("manager1");
        System.out.println("1 Manager: "+manager);

        Manager manager1 = Manager.getInstance("manager2");
        System.out.println("2 Manager: "+manager1);
        System.out.println(manager==manager1);

    }
}
