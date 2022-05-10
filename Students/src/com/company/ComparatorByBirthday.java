package com.company;

import java.util.Comparator;

public class ComparatorByBirthday implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getYearOfBirthday()-student2.getYearOfBirthday();
    }
}
