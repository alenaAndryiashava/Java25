package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorByGpaTest {

    @Test

    void testSortByGpa() {
        int answer = 2;
        Student student1 = new Student("Ivanov",1985,5.6);
        Student student2 = new Student("Petrov",1999,8.1);
        Student student3 = new Student("Sidorov",1979,7.8);

        List<Student> actual = Arrays.asList(student1, student2, student3);
        List<Student> expected = Arrays.asList(student1, student3, student2);
        actual.sort(SortingFactory.createComparator(answer));
        Assertions.assertEquals(expected, actual);
    }
}