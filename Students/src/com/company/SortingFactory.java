package com.company;

import java.util.Comparator;

public class SortingFactory {

    public static Comparator<Student> createComparator(int answer){
        switch (answer){
            case 2:return new ComparatorByGpa();
            case 3: return new ComparatorByBirthday();
            default:
                return new ComparatorByName();

        }
    }
}
