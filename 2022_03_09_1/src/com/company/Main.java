package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        //Create a class MyDate with the following fields: int day, int month, int year.
        //a. Implement the constructor method. It should take three integer arguments.
        //b. Implement String toString() method, that returns the String something like “21-15-2022”
        MyDate myDate = new MyDate(11, 5, 2022);
        MyDate birthdayTrainee = new MyDate(01, 02, 2003);
        MyDate birthdayTutor = new MyDate(02, 02, 1985);
        MyDate dateStart = new MyDate(13, 03, 2022);
        MyDate dateFinish = new MyDate(14, 03, 2022);
        System.out.println(myDate);

        System.out.println("Task 2");
        //Create a class Person with following fields: String firstName, String lastName, MyDate birthday.
        //a. Implement the constructor method.
        //b. Implement String toString() method, that returns the String something like
        // “Ivanov Ivan [21-15-2022]”

        Person person = new Person("Andryiashava", "Alena", myDate);
        Person trainee = new Person("Ivanov", "Ivan", birthdayTrainee);
        Person tutor = new Person("Petrov", "Peter", birthdayTutor);
        System.out.println(person);

        System.out.println("Task 3");
        //Create a class Practice with following fields: String subject ,
        // Person trainee, Person tutor, MyDate dateStart, MyDate dateFinish.
        //a. Implement the constructor method.
        //b. Implement String toString() method, that returns the String info about Practice.

        Practice practice = new Practice("OOP", trainee, tutor,dateStart,dateFinish);
        System.out.println(practice);
    }
}
