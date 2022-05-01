package com.company;

public class Main {

    public static void main(String[] args) {
        TransformString ts = new TransformString();
        System.out.println(ts.transformString("hello Java",new AddRoundBracketsToString()));
        System.out.println(ts.transformString("hello java",new FirstCharToUpperCase()));
    }
}
