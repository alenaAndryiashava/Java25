package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How would you like to sort?");
        System.out.println("Please choose one of following:"
                +System.lineSeparator() + "1. by name"
                + System.lineSeparator() + "2. gpa"
                + System.lineSeparator()+ "3. Birthday"+
                System.lineSeparator()+"other. by name");
        int answer = scanner.nextInt();

        Student student1 = new Student("Petrov",1985,5.6);
        Student student2 = new Student("Ivanov",1999,8.1);
        Student student3 = new Student("Suvorov",1979,7.8);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Comparator<Student> comparator = SortingFactory.createComparator(answer);
        students.sort(comparator);
        System.out.println(students);





    }
}
