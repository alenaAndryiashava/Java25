package com.company;

public class Square extends Quadrilateral{

    public Square(double a) {
        super(a,a,a,a);
    }

    @Override
    public double getArea() {
        return getA()*getA();
    }

    @Override
    public String getName() {
        return "Square ";
    }
}
