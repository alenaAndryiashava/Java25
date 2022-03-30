package com.company;

import java.util.Arrays;

public class ArrayCopyDemo {
    @Override
    public String toString() {
        return "ArrayCopyDemo{}";
    }

    public static void main(String[] args) {
        String[] str = {"1", "2","3"};
        String[] str1 = Arrays.copyOf(str,str.length+1);

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str1));

        ArrayCopyDemo arrayCopyDemo = new ArrayCopyDemo();

        System.out.println(arrayCopyDemo);

        Object object = new Object();
    }
}
