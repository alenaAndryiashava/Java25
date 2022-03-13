package com.company;

public class Author {
    String firstName;
    String lastName;
    int yearOfBirth;

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
