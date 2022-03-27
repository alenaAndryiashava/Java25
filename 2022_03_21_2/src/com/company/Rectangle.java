package com.company;

public class Rectangle extends Quadrilateral {

    public Rectangle(double a, double b) {
        super(a,b,a,b);
    }

    @Override
    public double getArea() {
        return getA()*getB();
    }

    @Override
    public String getName() {
        return "Rectangle ";
    }
}
