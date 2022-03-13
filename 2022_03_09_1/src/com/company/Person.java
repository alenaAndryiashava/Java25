package com.company;

public class Person {
    String firstName;
    String lastName;
    MyDate birthday;

    public String toString() {
        return lastName + " "+firstName +
                " " +
                "[" + birthday +
                ']';
    }
    public Person(String lastName,String firstName,MyDate birthday){
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
    }

}
