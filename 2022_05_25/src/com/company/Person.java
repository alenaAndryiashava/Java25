package com.company;
//4. Given a List . Person has unique int id and name.
// All persons in the list except one are unique.
// Implements the method that finds a non-unique Person in the list.
// Implement this task all ways you know and evaluate the time and
// space complexity of each way.

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
