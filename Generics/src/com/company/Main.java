package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer i = 10;
        Integer i2= new Integer(10);
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf("14");

        Double d1 = Double.valueOf(10.0);

        Boolean b1 = Boolean.FALSE;
        Boolean b2 = Boolean.valueOf("TRUE");
        Boolean b3 = Boolean.valueOf("jhj");
        System.out.println("true->"+b2);
        System.out.println("jhj ->"+b3);


        List<Integer> integers = new ArrayList<>();

        Character ch = 'a';

        System.out.println(i);

        System.out.println("--------------");

        Integer i10 = 20;
        Integer i20 = 20;
        Integer i30 = 200;
        Integer i40 = 200;

        System.out.println("i10 = 20; i20 = 20 ->"+ (i10==i20));
        System.out.println("i10 = 20; i20 = 20 ->"+i10.equals(i20));

        System.out.println("i30 = 200; i40 = 200 ->"+(i30==i40));
        System.out.println("i30 = 200; i40 = 200 ->"+i10.equals(i20));

        Integer i50 = 1000;
        i50++;//i10+10

        System.out.println(i50.byteValue());
        System.out.println("127 to binary System -> "+ Integer.toBinaryString(127));
        System.out.println("128 to binary System -> "+ Integer.toBinaryString(128));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(2_000_000_000*2);
        System.out.println(2_000_000_000L*2);//L -> long
        Long l = 10L;

        System.out.println("ParseInt");

        int s = Integer.parseInt("10");
        System.out.println(s);
        s = Integer.parseInt("10",2);
        System.out.println(s);

        System.out.println("Integer.rotate");
        System.out.println(10<<1);
        System.out.println(Integer.rotateLeft(10,1));


    }
}
