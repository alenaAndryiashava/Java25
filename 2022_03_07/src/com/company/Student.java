package com.company;

import java.util.Arrays;

public class Student {
    String name;
    int[] grad;
    double average;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grad=" + Arrays.toString(grad) +
                ", average=" + average +
                '}';
    }

    void calculateAverage() {
        double sum = 0.0;
        for (int j : grad) {
            sum += j;
        }
        average = sum/grad.length;
    }
}

